package br.com.felipesantos.java8;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class FutureExemplo {
	
	private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);
	
	public static void main(String[] args) throws InterruptedException  {
		Casa casa = new Casa(new Quarto());

		List<? extends Future<String>> listaFuture =
				new CopyOnWriteArrayList<>(casa.obterAfazeresDaCasa().stream()
						.map(atividade -> pessoasParaExecutarAtividade.submit(() -> {
							try {
								return atividade.realizar();
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							return null;
						})
								).collect(Collectors.toList())); // pra retornar uma list de Future


		while (true) { // enquanto não estiver terminado
			int qtdeDeAtividadesNaoFinalizadas = 0;

			for (Future<?> futuro : listaFuture) {
				if (futuro.isDone()) {
					try {
						System.out.println("Parabéns, você terminou de " + futuro.get());
						listaFuture.remove(futuro);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (ExecutionException e) {
						e.printStackTrace();
					}
				}else {
					qtdeDeAtividadesNaoFinalizadas++;
				}
			}
			if (listaFuture.stream().allMatch(Future::isDone)) {
				break;
			}
			
			System.out.println("Número de atividades não finalizadas " + qtdeDeAtividadesNaoFinalizadas);
			Thread.sleep(500);
		}
		pessoasParaExecutarAtividade.shutdown(); // a aplicação não termina a execução... tem que clicar em pausar
	}

}

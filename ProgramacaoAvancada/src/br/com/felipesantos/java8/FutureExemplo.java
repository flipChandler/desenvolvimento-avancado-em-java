package br.com.felipesantos.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureExemplo {
	
	private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);
	
	public static void main(String[] args) throws InterruptedException {
		Casa casa = new Casa(new Quarto());
		casa.obterAfazeresDaCasa().forEach(atividade -> pessoasParaExecutarAtividade.submit(() -> { // submit > execute
			try {
				atividade.realizar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}));
		pessoasParaExecutarAtividade.shutdown(); // a aplicação não termina a execução... tem que clicar em pausar
	}

}

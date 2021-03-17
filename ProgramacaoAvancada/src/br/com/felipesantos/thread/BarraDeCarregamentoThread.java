package br.com.felipesantos.thread;

public class BarraDeCarregamentoThread extends Thread {

	@Override
	public void run() {		
		super.run();
		
		try {
			Thread.sleep(5000); // desativar thread por 5 segundos
			System.out.println("Rodei barraThread1 em 5 segundos: " + this.getName()); // nome da thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

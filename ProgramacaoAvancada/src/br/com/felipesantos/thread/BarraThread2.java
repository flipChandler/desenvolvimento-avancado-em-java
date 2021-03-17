package br.com.felipesantos.thread;

public class BarraThread2 extends Thread {

	@Override
	public void run() {		
		super.run();
		
		try {
			Thread.sleep(10000); // desativar thread por 10 segundos
			System.out.println("Rodei barraThread2 em 10 segundos: " + this.getName()); // nome da thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

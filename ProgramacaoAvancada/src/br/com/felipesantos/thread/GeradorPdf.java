package br.com.felipesantos.thread;

public class GeradorPdf extends Thread {

	@Override
	public void run() {
		
		try {
			System.out.println("Iniciar GeradorPdf");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("PDF gerado!");
		
		
		
	}

}

package br.com.felipesantos.thread;

public class ExemploThread {

	public static void main(String[] args) { // no main tmb tem uma thread a ser executado pela JVM
		
		 BarraDeCarregamentoThread barraThread = new BarraDeCarregamentoThread();
		 BarraThread2 barraThread2 = new BarraThread2();
		 
		 barraThread.start(); // inicia thread dessa classe
		 barraThread2.start(); // inicia thread dessa classe
		 
		 System.out.println("Nome da thread: " + barraThread.getName());
		 System.out.println("Nome da thread: " + barraThread2.getName());
		 
		 GeradorPdf iniciarGeradorPdf = new GeradorPdf();
		 BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);
		 
		 iniciarGeradorPdf.start();
		 iniciarBarraDeCarregamento.start();
		 
		 
		 

	}

}

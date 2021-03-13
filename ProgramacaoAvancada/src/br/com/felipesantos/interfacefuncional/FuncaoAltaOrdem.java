package br.com.felipesantos.interfacefuncional;

public class FuncaoAltaOrdem {

	public static void main(String[] args) {
		Calculo soma = (a, b) -> a + b;
		Calculo sub = (a, b) -> a - b; 
		Calculo div = (a, b) -> a / b; 
		Calculo mult = (a, b) -> a * b;
		System.out.println("Soma: " + executar(soma, 5, 10)); 
		System.out.println("Subtração: " + executar(sub, 30, 10)); 
		System.out.println("Divisão: " + executar(div, 14, 7)); 
		System.out.println("Multiplicação: " + executar(mult, 3, 9)); 
	}
	
	
	public static int executar(Calculo calculo, int a, int b) {
		return calculo.somar(a, b);
	}
	
	
}

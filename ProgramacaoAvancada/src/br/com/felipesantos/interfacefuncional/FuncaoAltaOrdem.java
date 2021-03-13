package br.com.felipesantos.interfacefuncional;

public class FuncaoAltaOrdem {

	public static void main(String[] args) {
		Calculo soma = (a, b) -> a + b;
		Calculo sub = (a, b) -> a - b; 
		Calculo div = (a, b) -> a / b; 
		Calculo mult = (a, b) -> a * b;
		System.out.println("Soma: " + executar(soma, 5, 10)); 
		System.out.println("Subtra��o: " + executar(sub, 30, 10)); 
		System.out.println("Divis�o: " + executar(div, 14, 7)); 
		System.out.println("Multiplica��o: " + executar(mult, 3, 9)); 
	}
	
	
	public static int executar(Calculo calculo, int a, int b) {
		return calculo.somar(a, b);
	}
	
	
}

package br.com.felipesantos.interfacefuncional;

public class FuncaoAltaOrdem2 {

	public static void main(String[] args) {
		Calculo calculo = (a, b) -> a + b; // desenvolveu a lógica de Calculo (comportamento)
		System.out.println(executar(calculo, 5, 10)); // executar recebe o comportamento e os parametros
	}
	
	// método criado para executar o método da interface funcional
	// método que recebe outra função como parâmetro, é uma função de alta ordem
	// recebe outra função por parâmetro ou retorna uma função
	public static int executar(Calculo calculo, int a, int b) {
		return calculo.somar(a, b);
	}
	
	
}

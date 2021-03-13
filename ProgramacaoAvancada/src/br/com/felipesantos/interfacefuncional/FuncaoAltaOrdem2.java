package br.com.felipesantos.interfacefuncional;

public class FuncaoAltaOrdem2 {

	public static void main(String[] args) {
		Calculo calculo = (a, b) -> a + b; // desenvolveu a l�gica de Calculo (comportamento)
		System.out.println(executar(calculo, 5, 10)); // executar recebe o comportamento e os parametros
	}
	
	// m�todo criado para executar o m�todo da interface funcional
	// m�todo que recebe outra fun��o como par�metro, � uma fun��o de alta ordem
	// recebe outra fun��o por par�metro ou retorna uma fun��o
	public static int executar(Calculo calculo, int a, int b) {
		return calculo.somar(a, b);
	}
	
	
}

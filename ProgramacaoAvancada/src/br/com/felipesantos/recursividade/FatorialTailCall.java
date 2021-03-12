package br.com.felipesantos.recursividade;

public class FatorialTailCall {
	/*
	 * Tail Call: recurs�o em cauda � um tipo de recurs�o onde n�o h� nenhuma linha de c�digo ap�s a chamada
	 * do pr�prio m�todo, sendo assim, n�o h� nenhum tipo de processamento a ser feito ap�s a chamada recursiva.
	 * 
	 * A JVM n�o suporta a recursao em cauda, lan�ando um estouro de pilha (stackOverFlow) | passar 1000000 como parametro
	 * 
	 * � usada mais em Scala e Haskell
	 */
	public static void main(String[] args) {
			System.out.println(calcularFatorial(1000000));

	}
	
	public static int calcularFatorial(int valor) {
		return calcularFatorialAux(valor, 1);
	}
	
	public static int calcularFatorialAux(int valor, int fatorial) {
		if (valor == 0) {
			return fatorial;
		}
		return calcularFatorialAux(valor - 1, fatorial * valor);
	}

}

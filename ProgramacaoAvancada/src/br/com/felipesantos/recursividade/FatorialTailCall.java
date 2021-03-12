package br.com.felipesantos.recursividade;

public class FatorialTailCall {
	/*
	 * Tail Call: recursão em cauda é um tipo de recursão onde não há nenhuma linha de código após a chamada
	 * do próprio método, sendo assim, não há nenhum tipo de processamento a ser feito após a chamada recursiva.
	 * 
	 * A JVM não suporta a recursao em cauda, lançando um estouro de pilha (stackOverFlow) | passar 1000000 como parametro
	 * 
	 * é usada mais em Scala e Haskell
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

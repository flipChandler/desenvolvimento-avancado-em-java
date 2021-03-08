package br.com.felipesantos.exemplo;

import java.util.function.UnaryOperator;

public class Exemplo {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3; // paradigma funcional
		System.out.println("O resultado � = " + calcularValorVezesTrinta.apply(10));
		
		/*
		 * Composi��o de fun��es: � criar uma nova fun��o atrav�s da composi��o de outras. 
		 * Por exemplo, vamos criar uma fun��o que vai filtrar um array, filtrando somente os n�meros
		 * pares e multiplicando por 2 
		 * 
		 * Fun��es puras: � chamda de pura quando invocada mais de uma vez , produzindo o mesmo resultado.
		 */
	}

}

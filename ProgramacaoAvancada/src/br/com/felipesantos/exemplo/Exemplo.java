package br.com.felipesantos.exemplo;

import java.util.function.UnaryOperator;

public class Exemplo {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3; // paradigma funcional
		System.out.println("O resultado é = " + calcularValorVezesTrinta.apply(10));
		
		/*
		 * Composição de funções: é criar uma nova função através da composição de outras. 
		 * Por exemplo, vamos criar uma função que vai filtrar um array, filtrando somente os números
		 * pares e multiplicando por 2 
		 * 
		 * Funções puras: é chamda de pura quando invocada mais de uma vez , produzindo o mesmo resultado.
		 */
	}

}

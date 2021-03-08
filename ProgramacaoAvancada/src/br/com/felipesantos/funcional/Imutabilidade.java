package br.com.felipesantos.funcional;

import java.util.function.UnaryOperator;

public class Imutabilidade {

	public static void main(String[] args) {
		/*
		 * Imutabilidade: uma vez que um par�metro recebeu um valor, ele ir� possuir para sempre esse valor,
		 * quando criamos um objeto, ele n�o pode ser modificado 
		 */
		int valor = 20;
		UnaryOperator<Integer> retornarDobro = parametro -> parametro * 2;
		System.out.println("O dobro de " + valor + " � " + retornarDobro.apply(valor)); // 40
		System.out.println("Valor = " + valor); // 20, n�o � alterado
		

	}

}

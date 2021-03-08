package br.com.felipesantos.funcional;

import java.util.function.UnaryOperator;

public class Imutabilidade {

	public static void main(String[] args) {
		/*
		 * Imutabilidade: uma vez que um parâmetro recebeu um valor, ele irá possuir para sempre esse valor,
		 * quando criamos um objeto, ele não pode ser modificado 
		 */
		int valor = 20;
		UnaryOperator<Integer> retornarDobro = parametro -> parametro * 2;
		System.out.println("O dobro de " + valor + " é " + retornarDobro.apply(valor)); // 40
		System.out.println("Valor = " + valor); // 20, não é alterado
		

	}

}

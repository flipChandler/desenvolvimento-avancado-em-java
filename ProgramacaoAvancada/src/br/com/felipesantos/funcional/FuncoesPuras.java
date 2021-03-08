package br.com.felipesantos.funcional;

import java.util.function.BiPredicate;

public class FuncoesPuras {
	public static void main(String[] args) {
		/*
		 * Fun��es puras: � chamda de pura quando invocada mais de uma vez , produzindo o mesmo resultado.
		 */
		
		BiPredicate<Integer, Integer> verificarSeEMaior = (valor1, valor2) -> valor1 > valor2;
				
		System.out.println(verificarSeEMaior.test(15, 11));
		System.out.println(verificarSeEMaior.test(15, 17));
	}
}

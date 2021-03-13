package br.com.felipesantos.interfacefuncional;

import java.util.function.Predicate;

public class ExemploPredicate {

	public static void main(String[] args) {
		
		// Predicate só tem o metodo test
		Predicate<String> estaVazio = valor -> valor.isEmpty();
		System.out.println("Esta vazio? R: " + estaVazio.test(""));
		
		Predicate<String> estaVazioMR = String::isEmpty;
		String nome = "Susi";
		System.out.println("Esta vazio? R: " + estaVazioMR.test(nome));
	}

}

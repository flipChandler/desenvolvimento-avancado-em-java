package br.com.felipesantos.java11;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExemplo {

	public static void main(String[] args) {

		List<String> nomes = Arrays.asList("Felipe", "Bruna", "Camila", "Gaucha", "Josiani", "Rafaela", "Karina", "Beatriz");
		
		Collection<String> nomes2 = List.of("Felipe", "Bruna", "Camila", "Gaucha", "Josiani", "Rafaela", "Karina", "Beatriz");
		
		//sem ordem por adição
		Collection<String> nomes3 = Set.of("Felipe", "Bruna", "Camila", "Gaucha", "Josiani", "Rafaela", "Karina", "Beatriz");
		
		System.out.println(nomes);
		System.out.println(nomes2);
		System.out.println(nomes3);

	}

}

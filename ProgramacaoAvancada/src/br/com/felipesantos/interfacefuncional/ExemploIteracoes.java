package br.com.felipesantos.interfacefuncional;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploIteracoes {

	public static void main(String[] args) {
		String[] nomes = { "Felipe", "Sonia", "Juca", "Anakin", "Paulo", "Josiani", "Gabriela", "Felipe" };
		Integer[] numeros = {25, 38, 41, 69, 17 };
		
		System.out.println("----IMPRIMIR NOMES FILTRADOS------");
		imprimirNomesFiltrados(nomes);
		
		System.out.println("\n\n-----IMPRIMIR NOMES FILTRADOS STREAM ------");
		imprimirNomesFiltradosStream(nomes);

		System.out.println("\n-----IMPRIMIR TODOS OS NOMES FOR EACH------");
		imprimirTodosNomes(nomes);
		
		System.out.println("\n\n-----IMPRIMIR O DOBRO DE CADA NÚMERO DA LISTA------");
		imprimirODobroDeCada(numeros);

		System.out.println("\n\n-----IMPRIMIR O DOBRO DE CADA NÚMERO DA LISTA STREAM------");
		imprimirODobroDeCadaStream(numeros);		
		
		
	}

	public static void imprimirNomesFiltrados(String... nomes) {
		String nomesParaImprimir = "";
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Felipe")) {
				nomesParaImprimir += nomes[i];
			}
		}
		System.out.println(nomesParaImprimir);
		
	}
	
	public static void imprimirNomesFiltradosStream(String... nomes) {
		String nomesParaImprimirStream = Stream.of(nomes)
			.filter(nome -> nome.equals("Felipe"))
			.collect(Collectors.joining());
		
		System.out.println(nomesParaImprimirStream);
		
	}
	
	public static void imprimirTodosNomes (String... nomes) {
		for (String nome : nomes) {
			System.out.print(nome + " ");
		}
	}
	
	public static void imprimirTodosNomeStream (String... nomes) {
		Stream.of(nomes)
			.forEach(nome -> System.out.print(nome + " "));
	}
	
	public static void imprimirODobroDeCada (Integer... numeros) {
		for (Integer numero : numeros) {
			System.out.print(numero * 2 + " ");
		}
	}

	public static void imprimirODobroDeCadaStream (Integer... numeros) {
		Stream.of(numeros)
			.map(num -> num * 2)
			.forEach(num -> System.out.print(num + " "));		
	}
	
	

}

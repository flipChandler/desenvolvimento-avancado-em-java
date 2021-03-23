package br.com.felipesantos.inferencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {
	
	// utilizar a inferência (var) somente em variáveis locais
	// var não pode ser passado em parametro

	public static void main(String[] args) throws IOException {
		
		//connectAndPrintURLJavaOracle();
		//printNomeCompleto("Felipe", "Santos");
		System.out.println("Soma de 9 e 3 = " + somar(9, 3));
		
		somar(7, 56, 98);
	}

	public static void printNomeCompleto(String nome, String sobrenome) {
		var nomeCompleto = String.format("%s %s", nome, sobrenome);
		System.out.println("Nome Completo: " + nomeCompleto);

	}

	public static int somar(int a, int b) {
		var soma = a + b;		
		return soma;		
	}

	public static void somar(int... numeros) {
		var soma = 0;
		if (numeros.length > 0) {
			for (var numero : numeros) {
				soma += numero;
			}
			System.out.println("Soma = " + soma);
		}
	}
	
	
	
	public static void connectAndPrintURLJavaOracle() throws IOException {
		var url = new URL("https://docs.oracle.com/en/java/javase/11/docs/api/index.html");
		var urlConnection = url.openConnection(); // abre uma conexão da url

		// pegar as informações e seprar em linhas
		var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream())); 

		System.out.println(bufferedReader.lines()
				.collect(Collectors.joining()).replaceAll(">", ">\n")); // para quebrar a linha
	}

}

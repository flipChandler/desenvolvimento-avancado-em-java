package br.com.felipesantos.parallelstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExemplo {
	// utiliza processamento concorrente, -1 thread disponível no processador
	
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).forEach(num -> fatorial(num));
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execução Serial: " + (fim - inicio));// 4538 milissegundos
		
		inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num));
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução Parallel: " + (fim - inicio)); // 862 milissegundos
		
		List<String> nomes = Arrays.asList("Felipe", "Justin", "Priscila", "Josiani", "Karina", "Renata", "Rafaela"); // não é um ArrayList<>		
				
		nomes.parallelStream().forEach(System.out::println);
		
		
		
	}
	
	public static long fatorial(long num) {
		long fat = 1;
		
		for (long i = 2; i < num + 1; i++) {
			fat *= i;
		}
		return fat;
	}

}

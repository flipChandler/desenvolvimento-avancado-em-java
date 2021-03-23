package br.com.felipesantos.java11;

import java.util.function.Function;

public class InferenciaLambdaExemplo {
	
	// var dentro da Lambda
	public static void main(String[] args) {
		Function<Integer, Double> dividirPorDois = (var numero) -> numero / 2.0;
		
		System.out.println("10 / 2 = " + dividirPorDois.apply(10));
	}

}

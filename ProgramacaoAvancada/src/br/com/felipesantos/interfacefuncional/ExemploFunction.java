package br.com.felipesantos.interfacefuncional;

import java.util.function.Function;

public class ExemploFunction {

	public static void main(String[] args) {

		// Function<T, R> => Tipo e o Retorno | só tem o método apply
		Function<String, String> retornarNomeAoContrario = nome -> new StringBuffer(nome)
				.reverse()
				.toString();		
		System.out.println(retornarNomeAoContrario.apply("Felipe").toLowerCase());
		
		String numero = "23";		
		Function<String, Integer> converterStringParaIntEDobrar = valor -> Integer.parseInt(valor) * 2;
		System.out.println("Converter e dobrar -> " + numero + " = " + converterStringParaIntEDobrar.apply(numero));
		
		String numero2 = "19";		
		// method reference oculta o parametro e chama o metodo em seguida do ::, apenas quando tem 1 instrução
		Function<String, Integer> converterStringParaInt = Integer::parseInt;
		System.out.println("Converter -> " + numero2 + " = " + converterStringParaInt.apply(numero2));
		
		
		
	}

}

package br.com.felipesantos.funcional;

import java.util.Arrays;

public class ComposicaoDeFuncoes {

	public static void main(String[] args) {
		
		int[] valores = { 1, 2, 3, 4};
		
		// funcional
		Arrays.stream(valores)
			.filter(valor -> valor % 2 == 0) // filtra os pares
			.map(valor -> valor *2) // cada para multiplica-os por 2
			.forEach(valor -> System.out.println(valor)); // imprime cada produto dos pares		 
		
		// imperativo
		for (int i = 0; i < valores.length; i++) { 
			  int valor = 0;
			  if (valores[i] % 2 == 0) {
				  valor = valores[i] * 2; 
				  System.out.println(valor);
			  } 
		 }
		
	}

}

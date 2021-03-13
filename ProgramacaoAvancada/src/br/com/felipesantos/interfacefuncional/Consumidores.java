package br.com.felipesantos.interfacefuncional;

import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {
		
		Consumer<String> imprimirFrase = frase -> System.out.println(frase);
		imprimirFrase.accept("Ol� Mundo!");
		
		// method reference esconde o parametro "frase" e j� chama a fun��o "println"
		Consumer<String> imprimirOutraFrase = System.out::println;
		imprimirOutraFrase.accept("Como vai vc, parceir�o?");
		
		  
	}

}

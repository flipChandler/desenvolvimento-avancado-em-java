package br.com.felipesantos.interfacefuncional;

import java.util.function.Supplier;

public class ExemploSuppliers {

	public static void main(String[] args) {
		
		// Supplier -> o tipo que for especificado no <>, é o que será retornado quando chamar o get (unico metodo da interface)
		Supplier<Pessoa> instancia = () -> new Pessoa("Felipe", 34);		
		System.out.println(instancia.get());
		
		Supplier<Pessoa> outraInstancia = Pessoa::new;
		System.out.println(outraInstancia.get());

	}

}

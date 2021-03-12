package br.com.felipesantos.funcional;

@FunctionalInterface
public interface Funcao {
	/*
	 * Anotação @FunctionalInterface serve para proteger a interface, para não ser criado
	 * outros métodos e a interface não ser mais funcional
	 */
	String gerar(String valor);
}

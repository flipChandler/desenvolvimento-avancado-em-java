package br.com.felipesantos.funcional;

@FunctionalInterface
public interface Funcao {
	/*
	 * Anota��o @FunctionalInterface serve para proteger a interface, para n�o ser criado
	 * outros m�todos e a interface n�o ser mais funcional
	 */
	String gerar(String valor);
}

package br.com.felipesantos.java11;

public class StringRepeatExemplo {

	public static void main(String[] args) {
		String nome = "Felipe", aux = "";
		
		// antigo
		for (int i = 0; i < 10; i++) {
			aux += nome + " ";
		}
		
		System.out.println(aux);
		
		// novo
		String nome2 = "Mila ";
		
		System.out.println(nome2.repeat(10));
		
	}

}

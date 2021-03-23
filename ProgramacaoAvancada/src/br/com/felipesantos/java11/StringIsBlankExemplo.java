package br.com.felipesantos.java11;

public class StringIsBlankExemplo {

	public static void main(String[] args) {
		String espaco = "                           ";
		// � nulo OU tamanho � 0 OU todo seu espa�o tem ' '
		System.out.println(espaco == null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' ')); // true
		
		System.out.println(espaco.isBlank()); // true | no Java 11, criaram esse m�todo
	}

}

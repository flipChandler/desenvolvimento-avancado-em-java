package br.com.felipesantos.java11;

public class StringIsBlankExemplo {

	public static void main(String[] args) {
		String espaco = "                           ";
		// é nulo OU tamanho é 0 OU todo seu espaço tem ' '
		System.out.println(espaco == null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' ')); // true
		
		System.out.println(espaco.isBlank()); // true | no Java 11, criaram esse método
	}

}

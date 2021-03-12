package br.com.felipesantos.recursividade;

import java.util.HashMap;
import java.util.Map;

public class FatorialMemoization {
	
	public static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

	public static void main(String[] args) {
		long I = System.nanoTime();
		System.out.println(calcularFatorialMemoization(15));
		long F = System.nanoTime();
		System.out.println("FATORIAL 1 " + (F - I));
		
		// na segunda vez que fora realizar, é mais performático
		I = System.nanoTime();
		System.out.println(calcularFatorialMemoization(15));
		F = System.nanoTime();
		System.out.println("FATORIAL 2 " + (F - I));

	}
	
	public static Integer calcularFatorialMemoization(Integer valor) {
		if (valor == 1) {
			return valor;
		}else {
			if (MAPA_FATORIAL.containsKey(valor)) {
				return MAPA_FATORIAL.get(valor);
			}else {
				Integer fatorial = valor * calcularFatorialMemoization(valor - 1);
				MAPA_FATORIAL.put(valor, fatorial);
				return fatorial;
			}
		}
	}

}

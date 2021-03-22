package br.com.felipesantos.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Casa {
	private List<Comodo> comodos;
	
	Casa(Comodo... comodos) {
		this.comodos = Arrays.asList(comodos);
	}
	
	List<Atividade> obterAfazeresDaCasa() {
		return this.comodos.stream()
				.map(Comodo::obterAfazeresDoComodo)
				.reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
					pivo.addAll(atividades);
					return pivo;
				});
	}
}

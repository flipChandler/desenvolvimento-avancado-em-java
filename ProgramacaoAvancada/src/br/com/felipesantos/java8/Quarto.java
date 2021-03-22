package br.com.felipesantos.java8;

import java.util.Arrays;
import java.util.List;

public class Quarto extends Comodo{

	@Override
	List<Atividade> obterAfazeresDoComodo()  {
		return Arrays.asList(
				() -> arrumarACama(),
				this::varrerOQuarto,
				this::arrumarGuardaRoupa
			);
	}
	
	private void arrumarGuardaRoupa() throws InterruptedException  {
		Thread.sleep(5000);
		System.out.println("Arrumar o guarda-roupa!");
	}

	private void varrerOQuarto() throws InterruptedException {		
		Thread.sleep(5000);
		System.out.println("Varrer o quarto!");
	}
	
	private void arrumarACama() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Arrumar a cama!");
	}

}

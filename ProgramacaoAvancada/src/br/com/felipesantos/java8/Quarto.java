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
	
	private String arrumarGuardaRoupa() throws InterruptedException  {
		Thread.sleep(5000);
		String msg = "Arrumar o guarda-roupa!";
		System.out.println(msg);
		return msg;
	}

	private String varrerOQuarto() throws InterruptedException  {		
		Thread.sleep(7000);
		String msg = "Varrer o quarto!";
		System.out.println(msg);
		return msg;
	}
	
	private String arrumarACama() throws InterruptedException  {
		Thread.sleep(10000);
		String msg = "Arrumar a cama!";
		System.out.println(msg);
		return msg;
	}

}

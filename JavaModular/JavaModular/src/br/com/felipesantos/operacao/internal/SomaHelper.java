package br.com.felipesantos.operacao.internal;

import br.com.felipesantos.operacao.Operacao;

public class SomaHelper implements Operacao{

	@Override
	public int executar(int a, int b) {		
		return a + b;
	}

} 

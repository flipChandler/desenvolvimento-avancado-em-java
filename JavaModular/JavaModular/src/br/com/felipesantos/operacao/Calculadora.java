package br.com.felipesantos.operacao;

import br.com.felipesantos.operacao.internal.DivisaoHelper;
import br.com.felipesantos.operacao.internal.MultiplicacaoHelper;
import br.com.felipesantos.operacao.internal.SomaHelper;
import br.com.felipesantos.operacao.internal.SubtracaoHelper;

public class Calculadora {
	
	// somente Calculadora pode acessar as classes de internal (SomaHelper, SubtracaoHelper...)
	
	private SomaHelper somaHelper;
	private SubtracaoHelper subtracaoHelper;
	private MultiplicacaoHelper multiplicacaoHelper;
	private DivisaoHelper divisaoHelper;
	
	public Calculadora() {
		somaHelper = new SomaHelper();
		subtracaoHelper = new SubtracaoHelper();
		multiplicacaoHelper = new MultiplicacaoHelper();
		divisaoHelper = new DivisaoHelper();
	}
	
	
	public int somar(int a, int b) {
		return somaHelper.executar(a, b);
	}

	public int subtrair(int a, int b) {
		return subtracaoHelper.executar(a, b);
	}
	
	public int dividir(int a, int b) {
		return multiplicacaoHelper.executar(a, b);
	}
	
	public int multiplicar(int a, int b) {
		return divisaoHelper.executar(a, b);
	}
	
}

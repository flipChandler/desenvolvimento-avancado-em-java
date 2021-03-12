package br.com.felipesantos.exemplo;

import java.util.function.UnaryOperator;

import br.com.felipesantos.funcional.Funcao;

public class Exemplo {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3; // paradigma funcional
		System.out.println("O resultado � = " + calcularValorVezesTrinta.apply(10));
		
		/*
		 * Composi��o de fun��es: � criar uma nova fun��o atrav�s da composi��o de outras. 
		 * Por exemplo, vamos criar uma fun��o que vai filtrar um array, filtrando somente os n�meros
		 * pares e multiplicando por 2 
		 * 
		 * Fun��es puras: � chamda de pura quando invocada mais de uma vez , produzindo o mesmo resultado.
		 * 
		 * Estrutura de uma Lambda
		 * 
		 * InterfaceFuncional nomeVariavel = parametro -> logica
		 */
		
		// exemplo de uma Interface Funcional
		Funcao gerarUmaSaida = valor -> valor;
		
		// fun��o com Lambda
		Funcao colocarPrefixoSrNaString = nome -> "Sr. " + nome;
		System.out.println(colocarPrefixoSrNaString.gerar("Jo�o"));
		
		// se uma fun��o possuir mais de uma intru��o, deve-se utilizar CHAVES {}  e al�m disso, deve explicitar
		// o retorno se o mesmo for diferente de void
		
		Funcao outraFuncaoPrefixo = nome -> {
			String nomeComPrefixo = "Sr. " + nome;
			String mensagem = nomeComPrefixo + ".";
			return mensagem;
		};
	}

}

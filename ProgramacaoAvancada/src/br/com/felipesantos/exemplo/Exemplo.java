package br.com.felipesantos.exemplo;

import java.util.function.UnaryOperator;

import br.com.felipesantos.funcional.Funcao;

public class Exemplo {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3; // paradigma funcional
		System.out.println("O resultado é = " + calcularValorVezesTrinta.apply(10));
		
		/*
		 * Composição de funções: é criar uma nova função através da composição de outras. 
		 * Por exemplo, vamos criar uma função que vai filtrar um array, filtrando somente os números
		 * pares e multiplicando por 2 
		 * 
		 * Funções puras: é chamda de pura quando invocada mais de uma vez , produzindo o mesmo resultado.
		 * 
		 * Estrutura de uma Lambda
		 * 
		 * InterfaceFuncional nomeVariavel = parametro -> logica
		 */
		
		// exemplo de uma Interface Funcional
		Funcao gerarUmaSaida = valor -> valor;
		
		// função com Lambda
		Funcao colocarPrefixoSrNaString = nome -> "Sr. " + nome;
		System.out.println(colocarPrefixoSrNaString.gerar("João"));
		
		// se uma função possuir mais de uma intrução, deve-se utilizar CHAVES {}  e além disso, deve explicitar
		// o retorno se o mesmo for diferente de void
		
		Funcao outraFuncaoPrefixo = nome -> {
			String nomeComPrefixo = "Sr. " + nome;
			String mensagem = nomeComPrefixo + ".";
			return mensagem;
		};
	}

}

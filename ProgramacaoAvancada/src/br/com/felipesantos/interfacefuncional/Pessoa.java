package br.com.felipesantos.interfacefuncional;

public class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa() {
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}

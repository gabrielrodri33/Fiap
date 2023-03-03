package br.com.fiap.modelo;

public class Cliente {
	
	//visibilidade, tipo de dado e nome da variável
	private String nome;
	private int idade;
	
	//Setters (entrada)
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	//get (saída)
	public String getNome () {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}

}

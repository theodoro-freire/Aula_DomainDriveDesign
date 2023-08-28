package br.com.fiap.beans;

public class Cliente {

	// visibilidade, tipo de dado e variavel
	private String nome;
	private int idade;
	private double valor;

	// setNome = metodo
	// Setters (Entrada)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	// Getters (Saida)
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getValor() {
		return valor;
	}
}

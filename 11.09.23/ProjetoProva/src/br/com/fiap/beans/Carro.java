package br.com.fiap.beans;

public class Carro {
	//visibilidade, tipo de dado e variavel
	private String marca;
	private String modelo;
	private int ano;
	private double valorCarro;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorCarro() {
		return valorCarro;
	}
	public void setValorCarro(double valorCarro) {
		this.valorCarro = valorCarro;
	}
	
	//Setters (Entrada) e Getters(return/Exibir)
	
}

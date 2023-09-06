package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {
		// Ctrl + Shift + O = Importar classe "Cliente"
	
	public static void main(String[] args) {
		// Instanciar objeto
		Cliente objetoCliente = new Cliente();
		
		//Entradas
		objetoCliente.setNome("Theodoro");
		objetoCliente.setIdade(22);
		
		//Saidas
		
		System.out.println("Nome: " + objetoCliente.getNome() +
				"\nIdade: " + objetoCliente.getIdade());
		//System.out.println(objetoCliente.getNome());
		//System.out.println(objetoCliente.getIdade());
	}
}

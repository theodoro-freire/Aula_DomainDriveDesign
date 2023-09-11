package br.com.fiap.main;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objetos
		Cliente objetoCliente  = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Carro objetoCarro = new Carro();
		
		//Entrada (Input)
		//Cliente
		objetoCliente.setNome("Braufa");
		objetoCliente.setCpf("39485768412");
		objetoCliente.setIdade(52);
		objetoCliente.setValor(3555);
		//Endereço
		objetoEndereco.setLogradouro("Rua apito do vapor");
		objetoEndereco.setCep("04099-300");
		objetoEndereco.setNumero(177);
		objetoEndereco.setBairro("Bairro");
		objetoEndereco.setComplemento("Ap 10");
		objetoEndereco.setEstado("SP");
		objetoEndereco.setMunicipio("SP");
		//Carro
		objetoCarro.setMarca("FIAT");

		//Saídas (Exibir) -- ATALHO: sysout
		System.out.println("Nome do Cliente: " + objetoCliente.getNome() +
				"\nIdade: " + objetoCliente.getIdade());
		
		//Endereço
		System.out.println("Logradouro: " + objetoEndereco.getLogradouro());
		
		//Carro
		System.out.println("Marca: " + objetoCarro.getMarca());
		
	}

}

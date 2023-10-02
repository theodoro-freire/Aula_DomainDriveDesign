package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objetos
		
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Colaborador objetoColaborador = new Colaborador();
		
		//Entradas
		
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
		
		
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro: "));
		objetoEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP: "));
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
		
		objetoCliente.setEndereco(objetoEndereco);
		
		objetoColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador: "));
		objetoColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo do colaborador: "));
		objetoColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora: ")));
		objetoColaborador.setQtdadeHora(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas: ")));
		
		//Saidas
		
		System.out.println("Nome do cliente: " + objetoCliente.getNome() + "\nIdade do cliente: " +
		objetoCliente.getIdade() + "\nLogradouro: " + objetoCliente.getEndereco().getLogradouro() + "\nCep do cliente: " + 
				objetoCliente.getEndereco().getCep() + "\nNúmero: " + objetoCliente.getEndereco().getNumero()
				+ "\n\nINFORMAÇÕES DO COLABORADOR" + objetoColaborador.getTudo() + "\nSalário: " + objetoColaborador.calcularSalario());
		
		System.out.println("\n\nINFORMAÇÕES DE TAXA \n" + objetoColaborador.pagarTaxa());
		
	}

}

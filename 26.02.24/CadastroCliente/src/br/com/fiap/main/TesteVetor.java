package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteVetor {
	
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente[] vetorClientes = new Cliente[2];
		
		int indice = 0;
		
		do {
			vetorClientes[indice] = new Cliente();
			vetorClientes[indice].setCodigo(inteiro("Informe o código do cliente"));
			vetorClientes[indice].setNome(texto("Informe o nome do cliente"));
			vetorClientes[indice].setRg(texto("Informe o RG do cliente"));
			vetorClientes[indice].setRenda(real("Informe a renda do client"));
			
			indice ++;
			
		} while ( JOptionPane.showConfirmDialog(null, "Cadastrar mais cliente?", 
				"CADASTRO DE CLIENTES", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE)  ==0);
		
		for (int contador = 0; contador < indice; contador++ ) {
			System.out.println("\n\nCodigo: " + vetorClientes[contador].getCodigo() + 
					"\nNome: " + vetorClientes[contador].getNome() + "\nRG: " + 
					vetorClientes[contador].getRg() + "\nRenda: " + vetorClientes[contador].getRenda());
		}
		
	}

}

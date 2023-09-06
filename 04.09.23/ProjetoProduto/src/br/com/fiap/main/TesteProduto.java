package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// Instanciar objeto
		Produto objetoProduto = new Produto();
		
		//Entrada
		// jop
		// show + enter
		objetoProduto.setTipo(JOptionPane.showInputDialog("Digite o tipo de produto: "));
		objetoProduto.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
		// int: Integer
		// parseInt
		// jop
		objetoProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: ")));
		// Double
		// parseDouble
		// jop
		objetoProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
		
		//Saidas
		System.out.println("Tipo: " + objetoProduto.getTipo() +
				"\nMarca: " + objetoProduto.getMarca() + 
				"\nQuantidade: " + objetoProduto.getQuantidade() +
				"\nValor: " + objetoProduto.getValor());
	}

}

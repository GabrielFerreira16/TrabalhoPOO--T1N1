package br.edu.principal;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nome = "";
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		String msg = "Bem vindo, "+nome;
		JOptionPane.showMessageDialog(null, msg);

	}

}

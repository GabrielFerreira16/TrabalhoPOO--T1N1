package br.edu.principal;
//Lista resolvida questão 8 - depósito com juros

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        Double deposito = 0.0;
        System.out.print("Digite o quanto foi depositado: ");
        deposito = sc.nextDouble();
        
        Double juros = 0.0;
        System.out.print("Digite a porcentagem da taxa de juros: ");
        juros = sc.nextDouble();
        
        Double rendimento = deposito * juros/100;
        Double total = deposito + rendimento;
        
        System.out.println("O valor do rendimento foi de: "+rendimento);
        System.out.println("O valor total foi de: "+total);
        
	}




	}



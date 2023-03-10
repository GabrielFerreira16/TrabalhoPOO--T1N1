package br.edu.principal;
//Lista resolvida questão 14 - idade atual e em 2005

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        int nascimento = 0;
        System.out.print("Digite o ano em que você nasceu: ");
        nascimento = sc.nextInt();
        
        int ano = 0;
        System.out.print("Digite o ano atual: ");
        ano = sc.nextInt();
        
        int idade = ano - nascimento;
        
        System.out.println("Você tem "+idade+" anos.");
        
        if (nascimento <= 2005) {
            int id2005 = 2005 - nascimento;
            System.out.println("Em 2005 você tinha "+id2005+" anos.");
        } 
        
        if (nascimento > 2005) {
            System.out.println("Em 2005 você não havia nascido ainda.");
        }

	}

}

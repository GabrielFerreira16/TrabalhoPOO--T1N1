package br.edu.principal;
//Lista resolvida questão 12 - um número elevado ao outro

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        Double num1 = 0.0;
	        System.out.print("Digite um número: ");
	        num1 = sc.nextDouble();
	        
	        Double num2 = 0.0;
	        System.out.print("Digite o outro número: ");
	        num2 = sc.nextDouble();
	        
	        Double r1 = Math.pow(num1,num2);
	        Double r2 = Math.pow(num2,num1);
	        
	        System.out.println(num1+" elevado à "+num2+" é igual a "+r1);
	        System.out.println(num2+" elevado à "+num1+" é igual a "+r2);
	        
		}

	

	}



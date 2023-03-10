package br.edu.principal;
//Lista resolvida questão 13 - conversor de pés para polegadas, jardas e milhas

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        Double pes = 0.0;
	        System.out.print("Digite uma medida em pés: ");
	        pes = sc.nextDouble();
	        
	        Double polegadas = pes*12;
	        Double jardas = pes/3;
	        Double milhas = pes/5280;
	        
	        System.out.println("Isso equivale a "+polegadas+" polegadas.");
	        System.out.println("Isso equivale a "+jardas+" jardas.");
	        System.out.println("Isso equivale a "+milhas+" milhas.");
	        
	        
		}


	}



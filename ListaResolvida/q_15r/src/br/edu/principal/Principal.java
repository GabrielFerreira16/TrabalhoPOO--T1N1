package br.edu.principal;
//Lista resolvida questão 15 - custo do carro

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        Double preFab = 0.0;
	        System.out.print("Digite quanto é o preço de fabricação do veículo: ");
	        preFab = sc.nextDouble();
	        
	        Double perImp = 0.0;
	        System.out.print("Digite a porcentagem do preço será paga em impostos: ");
	        perImp = sc.nextDouble();
	        
	        Double perLuc = 0.0;
	        System.out.print("Digite a porcentagem de lucro desejada: ");
	        perLuc = sc.nextDouble();
	        
	        Double impostos = preFab * perImp/100;
	        Double lucro = preFab * perLuc/100;
	        Double preFinal = preFab+lucro+impostos;
	        
	        System.out.println("A quantidade de impostos paga será de: R$ "+impostos);
	        System.out.println("O lucro será de: R$ "+lucro);
	        System.out.println("O preço final do veículo será de: R$"+preFinal);
	        
		}


	}



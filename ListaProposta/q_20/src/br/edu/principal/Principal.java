package br.edu.principal;
//Lista proposta quest�o 20 - descobrir escada sabendo dist�ncia da parede e �ngulo
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        Double dist = 0.0;
	        System.out.print("Digite a dist�ncia da escada para a parede: ");
	        dist = sc.nextDouble();
	        
	        Double ang = 0.0;
	        System.out.print("Digite o �ngulo formado entre a escada e o ch�o: ");
	        ang = sc.nextDouble();
	        
	        Double radiano = ang * Math.PI / 180;
	        Double escada = dist / Math.cos(radiano);
	        
	        System.out.println("O comprimento da escada deve ser: "+escada);
		}

	}



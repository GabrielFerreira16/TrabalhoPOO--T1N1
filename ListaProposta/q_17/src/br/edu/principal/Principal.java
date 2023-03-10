package br.edu.principal;
//lista proposta questão 17- raio da esfera
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        Double raio = 0.0;
	        System.out.print("Digite quanto vale o raio da esfera: ");
	        raio = sc.nextDouble();
	        
	        Double comprimento = 2 * Math.PI * raio;
	        Double area = Math.PI * Math.pow(raio,2);  
	        Double volume = 3.0/4.0 * Math.PI * Math.pow(raio,3);
	        
	        System.out.println("O comprimento da esfera equivale à: "+comprimento);
	        System.out.println("A área da esfera equivale à: "+area);
	        System.out.println("O volume da esfera equivale à: "+volume);
		}

	}



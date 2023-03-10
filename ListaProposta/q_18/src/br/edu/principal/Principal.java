package br.edu.principal;
//lista proposta questão 18- conversor para fahrenheit
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        Double celcius = 0.0;
	        System.out.print("Digite uma temperatura em Celcius: ");
	        celcius = sc.nextDouble();
	        
	        Double fahrenheit = (celcius * 9/5)+ 32.0;
	        
	        System.out.println(celcius+" °C equivale à "+ fahrenheit +" °F.");

		}

	}



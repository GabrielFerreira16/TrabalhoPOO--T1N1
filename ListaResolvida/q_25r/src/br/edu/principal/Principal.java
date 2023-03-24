package br.edu.principal;

//Lista resolvida questão 25 - custo do espetáculo
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        Double custo = 0.0;
	        System.out.print("Digite quanto será gasto para a realização do espetáculo: ");
	        custo = sc.nextDouble();
	        
	        Double convite = 0.0;
	        System.out.print("Digite qual será o valor do convite: ");
	        convite = sc.nextDouble();
	       
	        Double minimo = custo/convite;
	        
	        System.out.println("Precisam ser vendidos no mínimo "+minimo+" convites.");

	}

}

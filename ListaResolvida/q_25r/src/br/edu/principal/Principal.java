package br.edu.principal;

//Lista resolvida quest�o 25 - custo do espet�culo
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        Double custo = 0.0;
	        System.out.print("Digite quanto ser� gasto para a realiza��o do espet�culo: ");
	        custo = sc.nextDouble();
	        
	        Double convite = 0.0;
	        System.out.print("Digite qual ser� o valor do convite: ");
	        convite = sc.nextDouble();
	       
	        Double minimo = custo/convite;
	        
	        System.out.println("Precisam ser vendidos no m�nimo "+minimo+" convites.");

	}

}

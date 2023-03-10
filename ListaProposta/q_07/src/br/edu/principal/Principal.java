package br.edu.principal;
//lista proposta questão 7- engordar 15% e emagrecer 20%
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        Double peso = 0.0;
        System.out.print("Dígite o seu peso(em quilos): ");
        peso = sc.nextDouble();
        
        System.out.println("O seu peso atual é "+peso+" quilos.");
        
        Double engo = ((15 * peso)/100) + peso;
        Double emag = peso - ((20 * peso)/100);
        
        System.out.println("Se você engordar 15% do seu peso ficará com "+engo+" quilos.");
        System.out.println("Se você emagrecer 20% do seu peso ficará com "+emag+" quilos.");
	}



	}



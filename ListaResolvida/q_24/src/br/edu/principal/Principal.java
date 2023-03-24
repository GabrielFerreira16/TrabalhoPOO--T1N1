package br.edu.principal;

import java.util.Scanner;
//Lista resolvida questão 24 - hora em número real


public class Principal {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        double hora = 0.0;
        System.out.print("Digite a hora(obs: 04:30 - 4.30): ");
        hora = sc.nextDouble();
       
        int h = (int)hora;
        
        double m = hora - h;
        
        double conv = (h*60) + (m*100);
        int realConv = (int)conv;
        
        System.out.println("Isto é equivalente a "+realConv+" minutos.");

	}

}

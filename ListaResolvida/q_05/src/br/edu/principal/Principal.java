package br.edu.principal;
//Lista resolvida questão 5 - salário e percentual de aumento

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Double sal = 0.0;
        System.out.print("Digite o salário do funcionário: ");
        sal = sc.nextDouble();
        
        Double perAumento = 0.0;
        System.out.print("Digite quantos por cento do salário ele receberá de aumento: ");
        perAumento = sc.nextDouble();
        
        Double aumento = sal * perAumento/100;
        Double novoSal = sal + aumento;
        
        System.out.println("O salário atual é de: R$ "+sal);
        System.out.println("O aumento será de: R$ "+aumento);
        System.out.println("O novo salário será de: R$ "+novoSal);
        
	}





	}



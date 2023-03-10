package br.edu.principal;
//lista resolvida questão 22- um numero elevado ao outro
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        Double sal = 0.0;
        System.out.print("Digite o salário mínimo: ");
        sal = sc.nextDouble();
        
        Double qwat = 0.0;
        System.out.print("Digite a quantidade de quilowatts consumida: ");
        qwat = sc.nextDouble();
        
        Double preQwat = sal / 5;
        Double preTotal = preQwat * qwat;
        Double pre15 = preTotal - (preTotal*15)/100;
        
        System.out.println("O preço a ser pago por cada quilowatt é "+preQwat);
        System.out.println("O preço total a ser pago pela residência é de "+preTotal);
        System.out.println("Com 15% de desconto o preço a ser pago é "+pre15);
        
	}



	}



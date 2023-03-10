package br.edu.principal;
//lista proposta questão 15- Salário de joão
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        Double salario = 0.0;
        System.out.print("Digite o salário de João: ");
        salario = sc.nextDouble();
        
        System.out.println("O salário de joão é R$ "+salario);
        
        Double conta1 = 0.0;
        System.out.print("Digite o valor da primeira conta: ");
        conta1 = sc.nextDouble();
        
        Double conta2 = 0.0;
        System.out.print("Digite o valor da segunda conta: ");
        conta2 = sc.nextDouble();
        
        Double multa1 = conta1*2/100 + conta1;
        Double multa2 = conta2*2/100 + conta2;
        
        Double resto = (salario - multa1) - multa2;
        
        System.out.println("O que restará do salário de joão é: R$ "+resto);
	}


	}



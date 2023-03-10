package br.edu.principal;
//lista proposta: questão 25- Conversor hora e minutos
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        int hora = 0;
        System.out.print("Digite a hora: ");
        hora = sc.nextInt();
        
        int minutos = 0;
        System.out.print("Digite os minutos: ");
        minutos = sc.nextInt();
        
        System.out.println(hora+":"+minutos);
        System.out.println(hora+" horas, equivalem à "+ hora*60 +" minutos");
        System.out.println("A quantidade total de minutos é de: "+ (hora*60 + minutos));
        System.out.println("A quantidade total de segundos é de: "+ (hora*60 + minutos)*60);
        
	}

	}



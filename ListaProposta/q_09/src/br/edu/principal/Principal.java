package br.edu.principal;
// lista proposta questão 9- área do trapézio 
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        Double baseMaior = 0.0;
        System.out.print("Dígite o comprimeto da base maior do trapézio: ");
        baseMaior = sc.nextDouble();
        
        Double baseMenor = 0.0;
        System.out.print("Dígite o comprimeto da base menor do trapézio: ");
        baseMenor = sc.nextDouble();
        
        Double altura = 0.0;
        System.out.print("Dígite a altura do trapézio: ");
        altura = sc.nextDouble();
        
        Double area = ((baseMaior+baseMenor)*altura)/2;
        
        System.out.println("A área do trapézio equivale à: "+area);
	}



	}



package br.edu.principal;
//lista Proposta questão 2- 3números multiplicados
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
    
    Double n1 = 0.0;
    System.out.print("Dígite o primeiro número: ");
    n1 = sc.nextDouble();
    
    Double n2 = 0.0;
    System.out.print("Dígite o segundo número: ");
    n2 = sc.nextDouble();
    
    Double n3 = 0.0;
    System.out.print("Dígite o terceiro número: ");
    n3 = sc.nextDouble();
    
    System.out.println("A múltiplicação desses números resulta em: "+(n1*n2*n3));
}

 }



package br.edu.principal;
//lista proposta Questão 19- Pôtencia de iluminação de um cômodo
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        Double parede1 = 0.0;
	        System.out.print("Digite a medida da parede da frente: ");
	        parede1 = sc.nextDouble();
	        
	        Double parede2 = 0.0;
	        System.out.print("Digite a medida da parede lateral: ");
	        parede2 = sc.nextDouble();
	        
	        Double area = parede1*parede2;
	        Double iluminação = area * 18;
	        
	        System.out.println("A área do cômodo equivale à "+area+" m².");
	        System.out.println("A potência necessária para iluminar este cômodo é de "+iluminação+" W.");

		}


	}



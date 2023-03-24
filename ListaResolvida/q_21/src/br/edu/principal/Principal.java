package br.edu.principal;

//Lista resolvida questão 21 - distância da escada para a parede
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double esc = 0.0;
        System.out.print("Digite o tamanho da escada: ");
        esc = sc.nextDouble();
        
        Double alt = 0.0;
        System.out.print("Digite a altura em que deseja pendurar o quadro: ");
        alt = sc.nextDouble();
        
        Double dist = Math.pow(esc,2) - Math.pow(alt,2);
        dist = Math.sqrt(dist);
        
        System.out.println("A distância entre a escada e a parede deve ser: "+dist);


	}

}

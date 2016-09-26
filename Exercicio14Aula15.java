package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio14Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double nota1 = s.nextDouble();
		
		System.out.println("Entre com a segunda nota:");
		double nota2 = s.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Sua média é: " + media);
		System.out.println();
		
		System.out.print("Média Aproveitamento        ");
		System.out.println("Conceito");
		
		if (media >= 9.0 && media <= 10.0 ) {
			System.out.println("Entre 9.0 e 10.0                A");
			System.out.println("APROVADO");
			
		} else if (media >= 7.5 && media < 9.0) {
			System.out.println("Entre 7.5 e 9.0                 B");
			System.out.println("APROVADO");
			
		} else if (media >= 6.0 && media < 7.5) {
			System.out.println("Entre 6.0 e 7.5                 C");
			System.out.println("APROVADO");
			
		} else if (media >= 4.0 && media < 6.0) {
			System.out.println("Entre 4.0 e 6.0                 D");
			System.out.println("REPROVADO");
			
		} else if (media < 4.0) {
			System.out.println("Entre 4.0 e zero                E");
			System.out.println("REPROVADO");
		} 
		
	}

}

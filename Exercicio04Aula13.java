package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio04Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = s.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = s.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota3 = s.nextInt();
		System.out.println("Digite a quarta nota: ");
		int nota4 = s.nextInt();
		
		double soma = nota1 + nota2 + nota3 + nota4;
		double media = soma / 4;
		
		System.out.println("A média das notas bimestrais é: " + media);
		
	}

}

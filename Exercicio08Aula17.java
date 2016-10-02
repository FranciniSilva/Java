package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio08Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double num;
		double soma = 0;
		double media = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Entre com o número " + i + ":");
			num = s.nextInt();
			
			soma += num;
			media = soma / i;
		}
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		
		

	}

}

package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio07Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Entre com o número " + i + ": ");
			num = s.nextInt();	
			
			if (num > maior) {
				maior = num;
				System.out.println("o número maior mudou: " + maior);
			}
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		

	}

}

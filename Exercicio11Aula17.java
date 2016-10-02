package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio11Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double soma = 0;
		int i;
		
		System.out.println("Entre com o primeiro número:");
		int num1 = s.nextInt();

		System.out.println("Entre com o segundo número:");
		int num2 = s.nextInt();

		for (i = num1 + 1; i < num2; i++) {
			if (num1 < num2) {
				System.out.println(" " + i);
			} else if (num1 > num2) {
				System.out.println(" " + i);
			} 
			soma += i;
		}
		System.out.println("Soma = " + soma);
		
		
		for (i = num2 + 1; i < num1; i++) {
			if (num2 < num1) {
				System.out.println(" " + i);
			} else if (num2 > num1) {
				System.out.println(" " + i);
			}
			soma += i;
		}
		System.out.println("Soma = " + soma);
		

	}

}

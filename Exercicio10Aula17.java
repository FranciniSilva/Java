package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio10Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o primeiro número:");
		int num1 = s.nextInt();

		System.out.println("Entre com o segundo número:");
		int num2 = s.nextInt();

		for (int i = num1; i < num2; i++) {
			if (num1 < num2) {
				System.out.println("Intervalo: " + i);
			} else if (num1 > num2) {
				System.out.println("Intervalo: " + i);
			} 
		}
		
		for (int i = num2; i < num1; i++) {
			if (num2 < num1) {
				System.out.println("Intervalo: " + i);
			} else if (num2 > num1) {
				System.out.println("Intervalo: " + i);
			}
		}
	}

}

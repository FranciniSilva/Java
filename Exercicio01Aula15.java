package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio01Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num1 = s.nextInt();
		
		System.out.println("Entre com outro número:");
		int num2 = s.nextInt();
		
		
		if (num1 > num2) {
			System.out.println("O primeiro número é maior: " + num1);
		} else {
			System.out.println("O segundo número é maior: " + num2);
		}

	}

}

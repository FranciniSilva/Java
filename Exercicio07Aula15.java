package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio07Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		int num1 = s.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int num2 = s.nextInt();
		
		System.out.println("Entre com o terceiro número:");
		int num3 = s.nextInt();
		
		if (num1 > num2 && num1 > num3) {
 			System.out.println("O primeiro número é maior: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo número é maior: " + num2);
		} else {
			System.out.println("O terceiro número é maior: " + num3);
		}
		
		
		if (num1 <= num2 && num1 <= num3) {
 			System.out.println("O primeiro número é o menor: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("O segundo número é o menor: " + num2);
		} else {
			System.out.println("O terceiro número é o menor: " + num3);
		}

	}

}

package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio02Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer:");
		int num = s.nextInt();
		
		if (num < 0) {
			System.out.println("O número digitado é negativo");
		} else {
			System.out.println("O número digitado é positivo");
		}

	}

}

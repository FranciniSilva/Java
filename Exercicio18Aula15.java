package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio18Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o número");
		int num = s.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("ímpar");
		}
	}

}

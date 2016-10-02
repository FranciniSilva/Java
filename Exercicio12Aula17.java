package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio12Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num = s.nextInt();
		
		System.out.println("Tabuada do " + num);
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}

	}

}

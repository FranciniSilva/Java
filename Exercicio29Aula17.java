package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio29Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com um número:");
		int num = s.nextInt();
		
		boolean primo = true;

		for (int i = 1; i <= num; i++) {
			

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					// System.out.println("Não é primo - divisível por " + i);
					primo = false;
				}
			}

			if (primo) {
				System.out.println(i);
			}
		}

	}

}

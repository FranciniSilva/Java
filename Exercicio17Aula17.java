package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio17Aula17 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num = s.nextInt();
		
		System.out.print("Fatorial de " + num + "! = ");
		
		int fatorial = 1;
		for (int i = num; i > 0; i--) {
			fatorial *= i;
			System.out.print(" " + i);
		}

		System.out.println(" = " + fatorial);
	}

}

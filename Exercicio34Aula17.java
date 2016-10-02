package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio34Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor de n:");
		int n = s.nextInt();
		
		double soma = 0;
		
		for (int i = 1, j = 1; j <= n; j++) {
			System.out.print(i + "/" + j  + " + ");
		}
	}
}

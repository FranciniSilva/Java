package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio15Aula17 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da série de fibonacci:");
		int n = s.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		for (int i = 3; i <= n; i++) {
			//21 = 8 + 13
			proximo = primeiro + segundo;
			//13
			primeiro = segundo;
			//21
			segundo = proximo;
			System.out.print(" " + proximo);
		}
		
	}

}

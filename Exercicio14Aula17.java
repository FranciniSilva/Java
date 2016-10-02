package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio14Aula17 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com 10 números inteiros:");
		int num;
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Numero " + i + ":");
			num = s.nextInt();
			
			if (num % 2 == 0) {
				quantidadePar++;
			} else if(num % 2 != 0){
				quantidadeImpar++;
			}
		}
		System.out.println("Quantidade Par: " + quantidadePar);
		System.out.println("Quantidade Ímpar: " + quantidadeImpar);
		
	}

}

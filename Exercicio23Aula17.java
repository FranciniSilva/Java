package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio23Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Preço do pão:");
		double preco = s.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " R$ " + (preco * i));
		}
	}

}

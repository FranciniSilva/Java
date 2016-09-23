package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio03Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num1 = s.nextInt();
		
		System.out.println("Digite outro número inteiro:");
		int num2 = s.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma entre os números digitados é: " + soma);

	}

}

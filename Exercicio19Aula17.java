package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio19Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o número de notas:");
		double notas = s.nextDouble();
		
		double soma = 0;
		double media = 0;
		double nota;
		
		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota: " + (i + 1));
			nota = s.nextDouble();
			soma += nota;
		}
		media = soma / notas;
		
		System.out.println("A soma é " + soma);
		System.out.println("A média é: " + media);
	}
}

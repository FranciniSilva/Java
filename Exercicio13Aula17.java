package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio13Aula17 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com a base:");
		int base = s.nextInt();
		
		System.out.println("Entre com o sexpoente:");
		int potencia = s.nextInt();
		
		int resultado = base;
		
		for (int i = 1; i < potencia; i++) {
			resultado *= base; 
		}
		System.out.println("Resultado = " + resultado);
		
	}
	
}

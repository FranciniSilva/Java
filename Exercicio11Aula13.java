package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio11Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int num1 = s.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		int num2 = s.nextInt();
		
		System.out.print("Digite um número real: ");
		double numReal = s.nextDouble();
		
		//letra a
		//double metade = num2 / 2;
		//int dobro = num1 * 2;
		//double produto = dobro * metade;
		int resultado1 = (num1 * 2) * (num2 / 2);	
		
		//letra b
		//double triplo = num1 * 3;
		//double soma = triplo + numReal;
		double resultado2 = (num1 * 3) + numReal;
		
		//letra c
		//double cubo = numReal * numReal * numReal;
		double resultado3 = Math.pow(numReal, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultado2);
		System.out.println("O terceiro elevado ao cubo: " + resultado3);
		
		
		
		

	}

}

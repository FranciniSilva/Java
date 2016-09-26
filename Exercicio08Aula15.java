package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio08Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto:");
		double prod1 = s.nextDouble();
		
		System.out.println("Informe o preço do segundo produto:");
		double prod2 = s.nextDouble();
		
		System.out.println("Informe o preço do terceiro produto:");
		double prod3 = s.nextDouble();
		
		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("Você deve comprar o primeiro!");
		} else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("Você deve comprar o segundo!");
		} else {
			System.out.println("Você deve comprar o terceiro!");
		}
	}

}

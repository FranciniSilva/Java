package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio05Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double popA;
		double popB;
		double taxaA;
		double taxaB;
		boolean valido = false;

		do {

			System.out.println("Entre com a população A:");
			popA = s.nextDouble();

			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("População A precisa ser maior que zero!");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Entre com a população B");
			popB = s.nextDouble();

			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("População B precisa ser maior que zero!");
			}

		} while (!valido);

		valido = false;
		do { 
			System.out
					.println("Entre com a taxa de crescimento da população A:");
			taxaA = s.nextDouble();

			if (taxaA > 0) {
				valido = true;
			} else {
				System.out
						.println("Taxa de crescimento A precisa ser maior que zero!");
			}

		} while (!valido);

		valido = false;
		do {

			System.out
					.println("Entre com a taxa de crescimento da população B:");
			taxaB = s.nextDouble();

			if (taxaB > 0) {
				valido = true;
			} else {
				System.out
						.println("Taxa de crescimento B precisa ser maior que zero!");
			}

		} while (!valido);

		
		int cont = 0;
		while (popA <= popB) {

			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Qtd anos:    " + cont);
	}

}

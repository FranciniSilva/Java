package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio15Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o lado 1:");
		int lado1 = s.nextInt();
		
		System.out.println("Entre com o lado 2:");
		int lado2 = s.nextInt();
		
		System.out.println("Entre com o lado 3:");
		int lado3 = s.nextInt();
		
		if (((lado1 + lado2) > lado3) ||
			((lado1 + lado3) > lado2) ||
			((lado2 + lado3) > lado1)) {
			
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triângulo Equilatero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2 ) {
				System.out.println("Trângulo Escaleno");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isóceles");
			}
			
		} else {
			System.out.println("Não forma um triângulo");
		}

	}

}

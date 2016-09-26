package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio17Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o ano:");
		int ano = s.nextInt();
		
		if ((ano % 400 == 0 ) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("é bissexto");
		} else {
			System.out.println("não é bissexto");
		}

	}

}

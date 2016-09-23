package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio12Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite sua altura:");
		double altura = s.nextDouble();
		
		double peso = (72.7 * altura) - 58;
		
		System.out.println("De acordo com sua altura seu peso ideal é: " + peso);
		
		

	}

}

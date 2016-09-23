package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio10Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		double tempC = s.nextInt();
		
		double tempF = tempC * 1.8 + 32;
		
		System.out.print("A temperatura em graus Farenheit é: " + tempF + "F");

	}

}

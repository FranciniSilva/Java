package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio09Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus Farenheit: ");
		double tempF = s.nextInt();
		
		double tempC = (5 * (tempF - 32) / 9);
		
		System.out.print("A temperatura em graus Celsius é: " + tempC + "C");
		

	}

}

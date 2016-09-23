package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio05Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros que deseja converter em centimetros:");
		double m = s.nextDouble();
		
		double cm = m / 0.01;
		
		/* ou double cm = m * 100*/
		
		System.out.println("O valor em metros convertido em centimetros é: " + cm + "cm");

	}

}

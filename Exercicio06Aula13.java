package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio06Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o raio do circulo:");
		double raio = s.nextDouble();
		
		double area = Math.PI * (raio * raio);
		
		/*ou double area = Math.PI* Math.pow (raio, 2) */
		
		System.out.println("A área do círculo é: " + area);

	}

}

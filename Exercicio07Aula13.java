package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio07Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um lado do quadrado:");
		double lado = s.nextDouble();
		
		//double area = lado * lado;
		double area = Math.pow(lado, 2);
		double dobro = area * 2;
		
		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro da área do quadrado é: " + dobro);
		

	}

}

package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio05Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		int nota1 = s.nextInt();
		
		System.out.println("Entre com a segunda nota:");
		int nota2 = s.nextInt();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Sua média final foi: " + media);
		
		if (media >= 7 && media < 10) {
			System.out.println("APROVADO");
		} else if (media < 7){
			System.out.println("REPROVADO");
		} else if(media == 10){
			System.out.println("APROVADO COM DISTINÇÃO");
		}

	}

}

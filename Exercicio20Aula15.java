package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio20Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Telefonou para vítima?");
		String resp1 = s.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = s.next();
		
		System.out.println("Mora perto da vítima?");
		String resp3 = s.next();
		
		System.out.println("Já trabalho com a vítima?");
		String resp4 = s.next();
		
		System.out.println("Devia para vítima?");
		String resp5 = s.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice");
		} else if (cont == 5) {
			System.out.println("Assassino");
		} else if (cont == 0) {
			System.out.println("Inocente");
		}
		
		
	}

}

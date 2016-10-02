package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio09Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		
		for (int i = 1; i < 50; i++) {
			if ((i % 2) == 0) {
				verdadeiro = false;
			} else {
				System.out.println("ímpares de 1 a 50: " + i);
			}
			
		}
		
		//ou
		//for (int i = 0; i < 50; i++) {
			//if (i % 2 != 0) {
				//System.out.println(i);
			//}
		//}

	}

}

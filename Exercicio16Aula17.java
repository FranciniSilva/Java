package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio16Aula17 {
	
	public static void main(String[] args) {
		
		int n = 500;
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while(proximo <= 500) {
			
			//21 = 8 + 13
			proximo = primeiro + segundo;
			//13
			primeiro = segundo;
			//21
			segundo = proximo;
			System.out.println(proximo);
		}
	}

}

package com.francini.cursojava;

import java.util.Scanner;

public class LoopWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i = 1;
		int max	 = 10;
		
		System.out.println("Contando até " + max);
		
		while(i <= max){
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
			
		} while (i < 15);
		
		System.out.println(i);
	}

}

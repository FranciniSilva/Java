package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio01Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			
			System.out.println("Entre com uma nota entre 0 e 10:");
			double nota = s.nextDouble();
			
			if(nota >= 0 && nota <= 10){
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Nota inválida, digite novamente");
			}  
			
		} while (!notaValida );
		
		
	}

}

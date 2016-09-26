package com.francini.cursojava;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio03AUla15 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		/*System.out.println("Digite uma letra correspondente ao sexo F, M:");
		char c = (char)System.in.read();
		
		switch (c) {
		case 'F':
			System.out.println("F - Feminino");
			break;
		case 'M':
			System.out.println("M - Masculino");
			break;
		default:
			System.out.println("Sexo Inválido");
			break;
		}*/
		
		System.out.println("Entre com uma letra (F ou M):");
		String input = s.next();
		
		if (input.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
			
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
			
		} else {
			System.out.println("Sexo Inválido");
		}
		

	}

}

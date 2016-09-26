package com.francini.cursojava;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio10Aula15 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda: M-matutino, V-Vespertino, N-Noturno");
		char turno = (char)System.in.read();
		
		switch (turno) {
		case 'M':
			System.out.println("Bom dia!");
			break;
		case 'V':
			System.out.println("Boa tarde!");
			break;
		case 'N':
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Valor Inválido!");
			break;
		}
	}

}

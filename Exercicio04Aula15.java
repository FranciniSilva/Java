package com.francini.cursojava;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio04Aula15 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma letra para saber se ela é vogal ou consoante:");
		String letra = s.next();
		
		if (letra.length() > 1) {
		 System.out.println("Não é uma letra válida");	
		 
		} else {
			switch (letra) {
			case "A":
			case "a":
			case "E":
			case "e":
			case "I":
			case "i":
			case "O":
			case "o":
			case "U":
			case "u":
				System.out.println("A letra digitada é vogal");
				break;
			case "B":
			case "b":
			case "C":
			case "c":
			case "D":
			case "d":
			case "F":
			case "f":
			case "G":
			case "g":
			case "H":
			case "h":
			case "J":
			case "j":
			case "K":
			case "k":
			case "L":
			case "l":
			case "M":
			case "m":
			case "N":
			case "n":
			case "P":
			case "p":
			case "Q":
			case "q":
			case "R":
			case "r":
			case "S":
			case "s":
			case "T":
			case "t":
			case "V":
			case "v":
			case "W":
			case "w":
			case "Y":
			case "y":
			case "X":
			case "x":
			case "Z":
			case "z":
				System.out.println("A letra digitada é uma consoante");
				break;
				
			default:
				System.out.println("Não é uma letra");
				break;
			}

		}
		
	}

}

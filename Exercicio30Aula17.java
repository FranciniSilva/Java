package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio30Aula17 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com um número para formar a tabuada: ");
		int num = s.nextInt();
		
		boolean invalido = true;
		int comeco;
		int  fim;
		
		do {
			
			System.out.print("Começar por: ");
			comeco = s.nextInt();
			
			System.out.print("Terminar em: ");
			fim = s.nextInt();
			
			if (fim > comeco) {
				invalido = false;
			}
			
		} while (invalido);	
		
		System.out.println("\nVou montar a tabuada do " + num + " começando em " + comeco + " e terminando em " + fim);
		
		for (int i = comeco; i <= fim; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
	}

}

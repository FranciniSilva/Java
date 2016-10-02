package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio21Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o número de turmas:");
		int qtTurma = s.nextInt();
		
		int numAlunos;
		double soma = 0;
		double media = 0;
		boolean invalido = true;
		
		for (int i = 1; i <= qtTurma; i++) {
			
			invalido = true;
			do {
				System.out.println("Entre com o número de alunos da turma:" + i);
				numAlunos = s.nextInt();
				
				if (numAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Número de alunos inválido. Digite novamente");
				}
			} while(invalido);
			
			soma += numAlunos;
		}
		media = soma / qtTurma;
		
		System.out.println("A média é: " + media);
		
	}

}

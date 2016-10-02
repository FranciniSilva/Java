package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio20Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de pessoas que deseja calcular a idade:");
		int qtdIdade = s.nextInt();
		
		int idade;
		double somaIdades = 0;
		double mediaIdade = 0;
		
		for (int i = 0; i < qtdIdade; i++) {
			System.out.println("Entre com a idade da pessoa " + (i + 1));
			idade = s.nextInt();
			
			somaIdades += idade;
		}
		
		mediaIdade = somaIdades / qtdIdade;
		System.out.println("A média de idade é: " + mediaIdade);
		if (mediaIdade >= 0 && mediaIdade <= 25) {
			System.out.println("Turma jovem");
		} else if (mediaIdade >= 26 && mediaIdade <= 60) {
			System.out.println("Turma de adulta");
		} else if (mediaIdade > 60) {
			System.out.println("Turma idosa");
		}
		
	}
}

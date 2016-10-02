package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio22Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("***** Olá colecionador *****");
		System.out.println("Informe a quantidade de CDs:");
		int qtdCd = s.nextInt();
		
		double valor;
		double soma = 0;
		double valorMedio = 0;
		
		for (int i = 1; i <= qtdCd; i++) {
			System.out.println("Informe o valor gasto no CD número " + i);
			valor = s.nextDouble();
			
			soma += valor;
		}
		System.out.println("O valor total investido nos CDs foi: " + soma);
		valorMedio = soma / qtdCd;
		System.out.println("O valor médio investido nos CDs foi: " + valorMedio);
	}
}

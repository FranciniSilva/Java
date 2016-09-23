package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio08Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double valorHora = s.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		double horasMes = s.nextDouble();
		
		double salario = valorHora * horasMes;
		
		System.out.println("O seu salário mensal é: R$" + salario);

	}

}

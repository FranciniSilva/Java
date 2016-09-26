package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio19Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		int num1 = s.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int num2 = s.nextInt();
		
		System.out.println("Entre com a operação (+ - / *): ");
		String operacao = s.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+": resultado = num1 + num2;
			break;
		case "-": resultado = num1 - num2;
			break;
		case "*": resultado = num1 * num2;
			break;
		case "/": resultado = num1 / num2;
			break;
		default: 
			System.out.println("Operação Inválida!"); 
			valida = false;
			break;
		}
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("resultado positivo");
			} else {
				System.out.println("resultado negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("resultado par");
			} else {
				System.out.println("resultado ímpar");
			}
		}

	}

}

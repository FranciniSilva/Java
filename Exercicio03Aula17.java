package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio03Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		
		do {
			System.out.println("Entre com o nome:");
			nome = s.next();
			
			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("O nome deve conter mais que três caracteres!");
			}
		} while(!infoValida);
			
		
		infoValida = false;
		int idade;
		
		do {
			
			System.out.println("Entre com a idade:");
			idade = s.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("A idade deve estar entre 0 e 150 anos");
			} 
			
		} while (!infoValida);
			
		infoValida = false;
		double salario;
		
		do {
			
			System.out.println("Entre com o salário:");
			salario = s.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("O salário deve ser maior que zero!");
			}
			
		} while (!infoValida);
			
		infoValida = false;
		String sexo;
		
		do {
			
			System.out.println("Entre com o genero (F ou M):");
			sexo = s.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("O genero deve ser M ou F");
			}
			
		} while (!infoValida);
			
			
		infoValida = false;
		String estCivil;
		
		do {
			
			System.out.println("Entre com o estado civil (s, c, v, d):");
			estCivil = s.next();
			
			if (estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") || estCivil.equalsIgnoreCase("v") || estCivil.equalsIgnoreCase("d") ) {
				infoValida = true;
			} else {
				System.out.println("O estado civil deve ser (s, c, v, d)");
			}

		} while (!infoValida);
		
		System.out.println("As seguinte sinformações foram coletadas:");
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Seu salário: " + salario);
		System.out.println("Seu genero: " + sexo);
		System.out.println("Seu estado civil: " + estCivil);

	}
}

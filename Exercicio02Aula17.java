package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio02Aula17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean senhaValida = false;
		
		do {
			
			System.out.print("Entre com o nome de usuário: ");
			String nomeUser = s.next();
			
			System.out.print("Entre com a senha: ");
			String senha = s.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual o nome de usuário, digite novamente.");
			} else {
				senhaValida = true;
				System.out.println("Nome de usuário e senha cadastrado com sucesso!");
			}
			
		} while (!senhaValida);
	}

}

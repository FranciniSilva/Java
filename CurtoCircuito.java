package com.francini.cursojava;

public class CurtoCircuito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		
		System.out.println(resultado2);
		System.out.println(resultado1);

	}

}

package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio21Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com a qtde de litros vendidos:");
		double litros = s.nextDouble();
		
		System.out.println("Entre com o tipo de combústivel:");
		String tipo = s.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDeDesc = 0;
		
		if (tipo.equalsIgnoreCase("a")) {
			
			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			
			total = litros * precoAlc;
			
		} else if (tipo.equalsIgnoreCase("g")) {
			
			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			
			total = litros * precoGas;
		}
		
		totalDeDesc = (total / 100) * percDesconto;
		
		double precoAPagar = total - totalDeDesc;
		
		System.out.println("Valor a ser pago: " + precoAPagar);
		
	}

}

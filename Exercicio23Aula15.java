package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio23Aula15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o tipo da carne:");
		System.out.println("1 - file duplo:");
		System.out.println("2 - alcatra:");
		System.out.println("3 - picanha:");
		int tipo = s.nextInt();
		
		System.out.println("Entre com a quantidade em (kg):");
		double qtd = s.nextDouble();
		
		double precoKg = 0;
		
		if (tipo == 1) {
			
			System.out.println(qtd + "kg - file duplo");
			
			if (qtd < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
		} else if (tipo == 2) {
			
			System.out.println(qtd + "kg - alcatra");
			
			if (qtd < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
		} else if (tipo == 3) {
			
			System.out.println(qtd + "kg - picanha");
			
			if (qtd < 5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}
		}	
		
		double total = qtd * precoKg;
		System.out.println(qtd + "kg * " + precoKg + " = R$" + total);
		
		System.out.println("Compra no cartão? digite 1 para sim e 0 para não:");
		int cartao = s.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: R$" + desconto);
			System.out.println("Valor a pagar: R$" + (total - desconto));
		} else if (cartao != 1){
			System.out.println("Valor a pagar: R$" + total);
		}
	}

}

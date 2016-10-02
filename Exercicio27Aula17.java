package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio27Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean sair = false;
		String continuar;
		int qtdTemperaturas;
		double temp;
		double total;
		double mediaTemp;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		do {
			System.out.println("Deseja fazer novos calculos de temperatura? S/N");
			continuar = s.next();
			
			if (continuar.equalsIgnoreCase("s")) {
				System.out.println("Digite a quantidade de temperaturas:");
				qtdTemperaturas = s.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= qtdTemperaturas; i++) {
					System.out.println("Informe a temperatura " + i);
					temp = s.nextDouble();
					
					total += temp;
					if (temp > maior) {
						maior = temp;
					}
					
					if (temp < menor) {
						menor = temp;
					}
				}
				mediaTemp = total / qtdTemperaturas;
				System.out.println("Média Temperaturas: " + mediaTemp);
				System.out.println("Menor temperatura: " + menor);
				System.out.println("Maior temperatura: " + maior);
				
			} else {
				sair = true;
			}
			
			
			
		} while (!sair);
		
		
	}

}

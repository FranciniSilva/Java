package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio13Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double valorHora = s.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		double horasMes = s.nextDouble();
		
		double salarioBruto = valorHora * horasMes;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDeDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDeDescontos;
		
		System.out.println("O seu salário bruto é: R$" + salarioBruto);
		System.out.println("O valor pago de INSS foi: R$" + inss);
		System.out.println("O valor pago de IR foi: R$" + ir);
		System.out.println("O valor pago de Sindicato foi: R$" + sindicato);
		System.out.println("Total descontos: R$" + totalDeDescontos);
		System.out.println("Seu salário liquido desse mês é: R$" + salarioLiquido);
	}

}

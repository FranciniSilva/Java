package com.francini.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salario = 1000; //95
		double percentual = 1.5;
		salario += (salario / 100) * percentual;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for (int i = 1997; i <= 2016; i++) {
			
			percentual *= 2;
			salario += (salario / 100) * percentual;
			
			System.out.println( i + " = " + format.format(salario) + " - " + percentual + "%" );
		}
		
		
		
	}
}

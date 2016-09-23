package com.francini.cursojava;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println("Soma " + resultado);
		
		resultado = resultado - 1;
		System.out.println("Subtração " + resultado);
		
		resultado = resultado * 2;
		System.out.println("Multiplicação " + resultado);
		
		resultado = resultado / 2;
		System.out.println("Divisão " + resultado);
		
		resultado = resultado + 8;
		System.out.println("Soma " + resultado);
		
		resultado = resultado % 7;
		System.out.println("Módulo " + resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		
		resultado++;
		System.out.println(resultado);
		
		//Vale 5
		System.out.println(resultado++);
		System.out.println(++resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);

	}

}

package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio14Aula13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo:");
		double tamArquivo = s.nextDouble();
		
		System.out.println("Entre com a velocidade da internet:");
		double velInternet = s.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempode download: " + tempo);

	}

}

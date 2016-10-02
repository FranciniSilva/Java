package com.francini.cursojava;

import java.util.Scanner;

public class Exercicio25Aula17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String outPut;
		double valorPago;
		double troco;
		
		do {
			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = s.next();
			
			if (continuarCompra.equalsIgnoreCase("s")) {
				
				outPut = "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos da compra:");
				qtdProdutos = s.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Informe preço do produto " + i);
					preco = s.nextDouble();
					total += preco;
					outPut += "Produto" + i + ": R$" + preco + "\n";
				}
				
				outPut += "Total: R$" + total;
				
				System.out.println("Total: R$" + total);
				
				System.out.println("Entre com o valor pago:");
				valorPago = s.nextDouble();
				
				outPut += "\nDinheiro: R$" + valorPago + "\n";
				
				troco = valorPago - total;
				
				outPut += "Troco: R$" + troco;
				
				System.out.println(outPut);
				
			} else {
				sair = true;
			}
		
		} while(!sair);
	}

}

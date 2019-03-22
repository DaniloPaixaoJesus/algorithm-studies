package com.danilopaixao.algorithm.marathon;

public class QuantidadeNota {
	
	public static void main(String[] args) {
		
		int[] notas = {50, 10, 5, 1};
		
		int[] valores = {99,100,22,4};
		
		for(int valorAtual = 0; valorAtual < valores.length; valorAtual++ ) {
			int valorTeste = valores[valorAtual];
			System.out.println("Valor: "+ valorTeste);
			for(int notaAtual = 0; notaAtual < notas.length; notaAtual++ ) {
				int quantidadeNota = valorTeste/notas[notaAtual]; 
				valorTeste = valorTeste - (quantidadeNota * notas[notaAtual]);
				System.out.print("quantidade nota: "+ quantidadeNota);
				System.out.println(" | valor da nota: "+ notas[notaAtual]);
				if(valorTeste <= 0) {
					break;
				}
			}
			System.out.println("----------------");
		}
	}

}

package com.danilopaixao.algorithm.sort;

import com.danilopaixao.algorithm.Nota;

/**
 * 
 * Time complexity: Logarithmic O(NlogN)
 * 
 * @author user
 *
 */
public class QuickSort {
	
	public static void main(String[] args) {
		
		Nota[] notas = { new Nota("andre", 4), new Nota("mariana", 5), new Nota("carlos", 8.5), new Nota("paulo", 9),
				new Nota("jonas", 3), new Nota("juliana", 6.7), new Nota("guilherme", 7), new Nota("lucia", 9.3),
				new Nota("ana", 10) };
		sort(notas, 0, notas.length);
		for (Nota nota : notas) {
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}
		
	}
	
	private static void sort(Nota[] notas, int de, int ate) {
		int elementos = ate - de;
		if(elementos > 1) {
			int posicaoPivo = particiona(notas, de, ate);
			sort(notas, de, posicaoPivo);
			sort(notas, posicaoPivo + 1, ate);
		}
	}

	private static int particiona(Nota[] notas, int inicial, int termino) {
		int menoresEncontrados = 0;
		Nota pivo = notas[termino-1];
		for (int analisando = 0; analisando < termino -1; analisando++) {
			Nota atual = notas[analisando];
			if(atual.getValor() <= pivo.getValor()) {
				troca(notas, analisando, menoresEncontrados);
				menoresEncontrados++;
			}
		}
		troca(notas, termino-1, menoresEncontrados);
		return menoresEncontrados;
	}

	public static void troca(Nota[] notas, int de, int para) {
		Nota nota1 = notas[de];
		Nota nota2 = notas[para];
		notas[para] = nota1;
		notas[de] = nota2;
	}

}

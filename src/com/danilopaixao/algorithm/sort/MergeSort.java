package com.danilopaixao.algorithm.sort;

import com.danilopaixao.algorithm.Nota;

/**
 * Merge Sort is a Divide and Conquer algorithm. 
 * It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. 
 * The merge() function is used for merging two halves. 
 * The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted 
 * and merges the two sorted sub-arrays into one.
 * 
 * Time complexity: Logarithmic O(NlogN)
 * 
 * @author user
 *
 */
public class MergeSort {

	public static void main(String[] args) {

		Nota[] notas = { new Nota("andre", 4), new Nota("mariana", 5), new Nota("carlos", 8.5), new Nota("paulo", 9),
				new Nota("jonas", 3), new Nota("juliana", 6.7), new Nota("guilherme", 7), new Nota("lucia", 9.3),
				new Nota("ana", 10) };

		sort(notas, 0, notas.length);
		for (Nota nota : notas) {
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}

	}
	
	private static void sort(Nota[] notas, int inicio, int termino) {
		int quantidade = termino - inicio;
		if(quantidade > 1) {
			int meio = (inicio + termino)/2;
			sort(notas, inicio, meio);
			sort(notas, meio, termino);
			merge(notas, inicio, meio, termino);
		}
	}

	private static void merge(Nota[] notas, int inicio, int posCorte, int termino) {
		Nota[] resultado = new Nota[termino - inicio];
		int atual1 = inicio;
		int atual2 = posCorte;
		int atual = 0;
		while (atual1 < posCorte && atual2 < termino) {
			Nota nota1 = notas[atual1];
			Nota nota2 = notas[atual2];
			if (nota1.getValor() < nota2.getValor()) {
				resultado[atual] = nota1;
				atual1++;
			} else {
				resultado[atual] = nota2;
				atual2++;
			}
			atual++;
		}
		while (atual1 < posCorte) {
			resultado[atual] = notas[atual1];
			atual1++;
			atual++;
		}

		while (atual2 < termino) {
			resultado[atual] = notas[atual2];
			atual2++;
			atual++;
		}
		for (int cont = 0; cont < atual; cont++) {
			notas[inicio + cont] = resultado[cont];
		}
	}

	private static Nota[] merge(Nota[] notas1, Nota[] notas2) {
		int total = notas1.length + notas2.length;
		Nota[] resultado = new Nota[total];
		int atual1 = 0;
		int atual2 = 0;
		int atual = 0;
		while (atual1 < notas1.length && atual2 < notas2.length) {
			Nota nota1 = notas1[atual1];
			Nota nota2 = notas2[atual2];
			if (nota1.getValor() < nota2.getValor()) {
				resultado[atual] = nota1;
				atual1++;
			} else {
				resultado[atual] = nota2;
				atual2++;
			}
			atual++;
		}
		while (atual1 < notas1.length) {
			resultado[atual] = notas1[atual1];
			atual1++;
			atual++;
		}
		while (atual2 < notas2.length) {
			resultado[atual] = notas2[atual2];
			atual2++;
			atual++;
		}
		return resultado;
	}
}

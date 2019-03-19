package com.danilopaixao.algorithm.sort;

import com.danilopaixao.algorithm.Note;

/**
 * 
 * Quicksort is a comparison sort, meaning that it can sort items of any type for which a "less-than" relation (formally, a total order) is defined. 
 * In efficient implementations it is not a stable sort, meaning that the relative order of equal sort items is not preserved. 
 * Quicksort can operate in-place on an array, requiring small additional amounts of memory to perform the sorting. 
 * It is very similar to selection sort, except that it does not always choose worst-case partition.
 * 
 * Mathematical analysis of quicksort shows that, on average, the algorithm takes O(n log n) comparisons to sort n items. 
 * In the worst case, it makes O(n2) comparisons, though this behavior is rare. 
 * 
 * Time complexity: Logarithmic O(NlogN)
 * 
 * @author user
 *
 */
public class QuickSort {
	
	public static void main(String[] args) {
		
		Note[] notes = { new Note("andre", 4), new Note("mariana", 5), new Note("carlos", 8.5), new Note("paulo", 9),
				new Note("jonas", 3), new Note("juliana", 6.7), new Note("guilherme", 7), new Note("lucia", 9.3),
				new Note("ana", 10) };
		sort(notes, 0, notes.length);
		for (Note note : notes) {
			System.out.println(note.getAluno() + " " + note.getValor());
		}
		
	}
	
	private static void sort(Note[] notes, int beginAt, int endAt) {
		int elements = endAt - beginAt;
		if(elements > 1) {
			int pivot = partition(notes, beginAt, endAt);
			sort(notes, beginAt, pivot);
			sort(notes, pivot + 1, endAt);
		}
	}

	private static int partition(Note[] notas, int inicial, int termino) {
		int menoresEncontrados = 0;
		Note pivo = notas[termino-1];
		for (int analisando = 0; analisando < termino -1; analisando++) {
			Note atual = notas[analisando];
			if(atual.getValor() <= pivo.getValor()) {
				swapping(notas, analisando, menoresEncontrados);
				menoresEncontrados++;
			}
		}
		swapping(notas, termino-1, menoresEncontrados);
		return menoresEncontrados;
	}

	public static void swapping(Note[] notas, int de, int para) {
		Note nota1 = notas[de];
		Note nota2 = notas[para];
		notas[para] = nota1;
		notas[de] = nota2;
	}

}

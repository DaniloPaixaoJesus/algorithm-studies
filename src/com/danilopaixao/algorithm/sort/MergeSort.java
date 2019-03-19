package com.danilopaixao.algorithm.sort;

import com.danilopaixao.algorithm.Note;

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

		Note[] notes = { new Note("andre", 4), new Note("mariana", 5), new Note("carlos", 8.5), new Note("paulo", 9),
				new Note("jonas", 3), new Note("juliana", 6.7), new Note("guilherme", 7), new Note("lucia", 9.3),
				new Note("ana", 10) };

		sort(notes, 0, notes.length);
		for (Note nota : notes) {
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}

	}
	
	private static void sort(Note[] notes, int beginAt, int endAt) {
		int quantity = endAt - beginAt;
		if(quantity > 1) {
			int middle = (beginAt + endAt)/2;
			sort(notes, beginAt, middle);
			sort(notes, middle, endAt);
			merge(notes, beginAt, middle, endAt);
		}
	}

	private static void merge(Note[] notes, int beginAt, int cutPosition, int endAt) {
		Note[] result = new Note[endAt - beginAt];
		int current1 = beginAt;
		int current2 = cutPosition;
		int i = 0;
		while (current1 < cutPosition && current2 < endAt) {
			Note note1 = notes[current1];
			Note note2 = notes[current2];
			if (note1.getValor() < note2.getValor()) {
				result[i] = note1;
				current1++;
			} else {
				result[i] = note2;
				current2++;
			}
			i++;
		}
		while (current1 < cutPosition) {
			result[i] = notes[current1];
			current1++;
			i++;
		}

		while (current2 < endAt) {
			result[i] = notes[current2];
			current2++;
			i++;
		}
		for (int cont = 0; cont < i; cont++) {
			notes[beginAt + cont] = result[cont];
		}
	}

}

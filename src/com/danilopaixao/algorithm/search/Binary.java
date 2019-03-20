package com.danilopaixao.algorithm.search;

import com.danilopaixao.algorithm.Note;
import com.danilopaixao.algorithm.sort.QuickSort;

/**
 * Binary search works on sorted arrays. 
 * Binary search begins by comparing the middle element of the array with the target value. 
 * If the target value matches the middle element, its position in the array is returned. 
 * If the target value is less than the middle element, the search continues in the lower half of the array. 
 * If the target value is greater than the middle element, the search continues in the upper half of the array. 
 * By doing this, the algorithm eliminates the half in which the target value cannot lie in each iteration
 * 
 * Time complexity: Logarithmic O(logN)
 * 
 * @author user
 *
 */
public class Binary {
	
	public static void main(String[] args) {
		
		Note[] notes = { new Note("andre", 4), new Note("mariana", 5), new Note("carlos", 8.5), new Note("paulo", 9),
				new Note("jonas", 3), new Note("juliana", 6.7), new Note("guilherme", 7), new Note("lucia", 9.3),
				new Note("ana", 10) };
		for (Note note : notes) {
			System.out.println(note.getAluno() + " " + note.getValor());
		}
		System.out.println("-------");
		QuickSort.sort(notes, 0, notes.length);
		System.out.println("-------");
		for (Note note : notes) {
			System.out.println(note.getAluno() + " " + note.getValor());
		}
		System.out.println("-------");
		
		double value = 5.1;
		int p = search(notes, value);
		if(p >= 0) {
			System.out.println(notes[p].getAluno() + " " + notes[p].getValor());
		}else {
			System.out.println("Nota " + value + " não encontrada!");
		}
		
	}
	
	public static int search(Note[] notes, double param) {
		QuickSort.sort(notes, 0, notes.length);
		return search(notes, 0, notes.length, param);
	}
	
	private static int search(Note[] notes, int beginAt, int endAt, double param) {
		if(beginAt > endAt) {
			return -1;
		}
		int middle = (beginAt + endAt)/2;
		Note note = notes[middle];
		if(param == note.getValor()) {
			return middle;
		}else if(param > note.getValor()) {
			return search(notes, middle+1, endAt, param);
		}else if(param < note.getValor()) {
			return search(notes, beginAt, middle-1, param);
		}
		return -1;
	}

}

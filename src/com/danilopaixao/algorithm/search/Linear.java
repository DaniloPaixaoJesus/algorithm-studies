package com.danilopaixao.algorithm.search;

import com.danilopaixao.algorithm.Note;

/**
 * 
 * In computer science, linear search or sequential search is a method for finding an element within a list. 
 * It sequentially checks each element of the list until a match is found or the whole list has been searched.[1]
 * 
 * Linear search runs in at worst linear time and makes at most n comparisons, where n is the length of the list. 
 * If each element is equally likely to be searched, then linear search has an average case of n/2 comparisons, 
 * but the average case can be affected if the search probabilities for each element vary. 
 * Linear search is rarely practical because other search algorithms and schemes, such as the binary search algorithm and hash tables, 
 * allow significantly faster searching for all but short lists.[2] 

 * @author user
 *
 */
public class Linear {
	
	public static void main(String[] args) {
		
		Note[] notes = { new Note("andre", 4), new Note("mariana", 5), new Note("carlos", 8.5), new Note("paulo", 9),
				new Note("jonas", 3), new Note("juliana", 6.7), new Note("guilherme", 7), new Note("lucia", 9.3),
				new Note("ana", 10) };
		int p = search(notes, 0, notes.length, 6.7);
		System.out.println(notes[p].getAluno() + " " + notes[p].getValor());
		
	}
	
	public static int search(Note[] notes, int beginAt, int endAt, double param) {
		for (int current = 0; current < endAt; current++) {
			if(notes[current].getValor() == param) {
				return current;
			}
		}
		return -1;
	}

}

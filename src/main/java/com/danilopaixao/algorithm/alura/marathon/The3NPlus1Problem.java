package com.danilopaixao.algorithm.alura.marathon;

import java.util.Scanner;

public class The3NPlus1Problem {

	public static void main1(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();

			if (i > j) {
				int temporario = j;
				j = i;
				i = temporario;
			}

			int maiorCicloAteAgora = 1;
			for (int atual = Math.min(i, j); atual <= Math.max(i, j); atual++) {
				int resultado = exec3NPlus1(atual);
				if (resultado > maiorCicloAteAgora) {
					maiorCicloAteAgora = resultado;
				}

			}
			System.out.println(i + " " + j + " " + maiorCicloAteAgora);
		}
	}

	private static int exec3NPlus1(int n) {
		int impressos = 1;
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 1)
				n = n * 3 + 1;
			else
				n = n / 2;
			impressos++;
		}
		return impressos;
	}
	
	public static void main2(String[] args) {
		exec3NPlus1Recursive(22);
	}
	
	public static int exec3NPlus1Recursive(int n) {
		System.out.println(n);
		if (n == 1) {
			return n;
		} else if (n % 2 != 0) {
			exec3NPlus1Recursive(3 * n + 1);
		} else {
			exec3NPlus1Recursive(n / 2);
		}
		return -1;
	}

	public static void main(String[] args) {
		int i = 1;
		int j = 999999;
		
//		exec3NPlus1Recursive(18);

		if (i > j) {
			int temporario = j;
			j = i;
			i = temporario;
		}
		
		int maxCycle = 0;
		int valueMaxCycle = 0;
		for(int cont = i; cont <= j; cont++) {
			int tmpMax = cycleLength(cont);
			if (tmpMax > maxCycle) {
				maxCycle = tmpMax;
				valueMaxCycle = cont;
			}
		}
		System.out.println("valor do maior ciclo (" + j + "): "+ valueMaxCycle);
		System.out.println("quantidade de ciclo para (" + j + "): "+ maxCycle);
		
		
	}
	
	public static int cycleLength(long n) {
	    // our base case
	    // 1 has a cycle length of 1
	    if (n == 1)
	        return 1;
	 
	    // the cycle length of the current number is 1 greater
	    // than the cycle length of the next number
	    int length = 1 + cycleLength(next(n));
	 
	    return length;
	}
	
	public static long next(long n) {
	    if (n % 2 == 0) {
	        return n / 2;       // if n is even
	    
	    }else {
	        return 3 * n + 1;   // if n is odd
	    }
	    
	}
	
	public static int quantidadeCiclo(long n) {
	    if (n == 1)
	        return 1;
		long nextValue = 0;
		if (n % 2 == 0) {
	    	nextValue = n / 2;       // if n is even
	    
	    }else {
	    	nextValue = 3 * n + 1;   // if n is odd
	    }
	    int length = 1 + quantidadeCiclo(nextValue);
	 
	    return length;
	}

}

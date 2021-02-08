package com.danilopaixao.algorithm.alura.marathon;


/**
 * 
 * Use of memoization(memoização without R) to avoid run entire recursion tree
 
  	//fib(0) = fib(1) = 1
	//fib(n) = fib(n-1) + fib(n-2)
	//fib(2) =  fib(2-1) + fib(2-2) 
	//		 => fib(1) + fib(0)
	//       => 1 + 1
	//       => 2
	
	//fib(3) =  fib(3-1) + fib(3-2) 
	//		 => fib(2) + fib(1)
	//       => 2 + 1
	//       => 3
	
	//fib(4) =  fib(4-1) + fib(4-2) 
	//		 => fib(3) + fib(2)
	//       => 3 + 2
	//       => 5
 * 
 * @author user
 *
 */
public class FibonacciSequence {
	
	private static final int LENGHT = 70;
	
	public static void main(String[] args) {
		int N = 50;
		System.out.println(calcFibonacciFast(N));
		System.out.println(calcFibonacci(N));
	}
	
	private static boolean[] calculatedPointOfTree = new boolean[LENGHT];
	private static long[] fibonacciTreeAux = new long[LENGHT];
	public static long calcFibonacciFast(int value) {
		if(calculatedPointOfTree[value]) {
			return fibonacciTreeAux[value];
		}
		calculatedPointOfTree[value] = true;
		if(value == 0 
			|| value == 1 ) {
			fibonacciTreeAux[value] = 1;
		}else {
			fibonacciTreeAux[value] = calcFibonacciFast(value-1) + calcFibonacciFast(value-2);
		}
		return fibonacciTreeAux[value];
		
	}
	
	public static int calcFibonacci(long N) {
		if(N == 0 
			|| N == 1 ) {
			return 1;
		}else {
			return calcFibonacci(N-1) + calcFibonacci(N-2);
		}
		
	}

}

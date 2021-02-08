package com.danilopaixao.algorithm.alura.marathon;

/**
 * 
 * @author user
 * 
   // 5 != 5 * 4 * 3 * 2 * 1
   // N! = N*(N-1)*(N-2)*(N-...)
 *
 */
public class Factorial {
	
	public static void main(String[] args) {
		
		int N = 12;

		System.out.println(factorialReverse1(N));
		System.out.println(factorialReverse2(N));
		System.out.println(factorialNoReverse(N));
		
	}

	private static long factorialReverse1(long N) {
		if (N > 0) {
			return N * factorialReverse2(N-1);
		}else {
			return 1;
		}
	}
	
	private static long factorialReverse2(long N) {
		return operacaoFatorial(N*(N-1), N-1);
	}
	
	private static long operacaoFatorial(long value, long N) {
		if(N-1 == 0) {
			return value * N;
		}
		return operacaoFatorial(value*(N-1), N-1);
	}
	

	private static long factorialNoReverse(int N) {
		long resultado = N;
		for(long i = 1; i <= N; i++) {
			if(N-i <= 0) {
				break;
			}
			//System.out.println(resultado+"*"+ (N-i) + "=" + (resultado*(N-i)));
			resultado = resultado*(N-i);
		}
		return resultado;
	}

}

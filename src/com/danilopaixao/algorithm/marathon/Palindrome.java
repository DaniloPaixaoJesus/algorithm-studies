package com.danilopaixao.algorithm.marathon;

import java.util.Scanner;

public class Palindrome {
	
	public static void teste(String[] args) {
        String[] palavras = {"HELloolLEH", "ILOVEyou", "123456", "12321"};
        for(int i = 0; i < palavras.length; i++){
            String palavra = palavras[i];
            System.out.print(i + " " + palavra );
            if(isPolindrome(palavra)) {
                System.out.println(" YES");
             } else {
                System.out.println(" NO");
             }
        }
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i < casos+1; i++){
            String palavra = scanner.nextLine();
            System.out.print(i + " " + palavra );
            if(isPolindromeAPI(palavra)) {
                System.out.println(" YES");
             } else {
                System.out.println(" NO");
             }
        }
	}
	
	public static boolean isPolindrome(String palavra) {
	    for(int i = 0; i < palavra.length()/2; i++){
	      char esquerda = palavra.charAt(i);
	      char direita = palavra.charAt(palavra.length() - 1 -i);
	      if(esquerda != direita){
	          return false;
	      }
	    }
	    return true;
	}
	
	public static boolean isPolindromeAPI(String palavra) {
	    String invertida = new StringBuilder(palavra).reverse().toString();
	    return palavra.equals(invertida);
	}

}

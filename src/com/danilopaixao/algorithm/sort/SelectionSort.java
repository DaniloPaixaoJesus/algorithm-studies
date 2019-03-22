package com.danilopaixao.algorithm.sort;

import com.danilopaixao.vo.Product;

/**
 * In computer science, selection sort is a sorting algorithm, specifically an in-place comparison sort. 
 * It has O(n2) time complexity, making it inefficient on large lists, 
 * and generally performs worse than the similar insertion sort. 
 * Selection sort is noted for its simplicity, 
 * and it has performance advantages over more complicated algorithms in certain situations, 
 * particularly where auxiliary memory is limited.
 * 
 * Time complexity: quadratic O(n\log n)
 * 
 * @author user
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		Product[] products = Product.generateProducts();
		
		int less = getPosLessPrice(products, 0, products.length-1);
		System.out.println("Menor Preco >>");
		Product.printProduct(products[less]);
		System.out.println(">>");

		Product.printAllProducts(products);
		System.out.println(" ");
		products = orderByLessPrice(products, 0, products.length);
		Product.printAllProducts(products);
	}
	
	public static Product[] orderByLessPrice(Product[] products, int ini, int end) {
		for (int current = ini; current < end; current++) {
			int less = getPosLessPrice(products, current, end-1);
			Product productCurrent = products[current];
			Product produtoLessPrice = products[less];
			products[current] = produtoLessPrice;
			products[less] = productCurrent;
			
		}
		return products;
	}

	public static int getPosLessPrice(Product[] products, int posInitial, int posFinal) {
		int posLessPrice = posInitial;
		for (int atual = posInitial; atual <= posFinal; atual++) {
			if (products[atual].getPrice().compareTo(products[posLessPrice].getPrice()) == -1)
				posLessPrice = atual;
		}
		return posLessPrice;
	}

}

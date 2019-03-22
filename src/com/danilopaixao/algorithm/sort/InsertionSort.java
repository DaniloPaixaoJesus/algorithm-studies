package com.danilopaixao.algorithm.sort;

import com.danilopaixao.vo.Product;

/**
 * Insertion sort iterates, consuming one input element each repetition, 
 * and growing a sorted output list. 
 * At each iteration, insertion sort removes one element from the input data, 
 * finds the location it belongs within the sorted list, and inserts it there. 
 * It repeats until no input elements remain. 
 * 
 * Time complexity: quadratic O(n^2)
 * 
 * @author user
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		Product[] products = Product.generateProducts();
		Product.printAllProducts(products);
		products = order(products, products.length);
		Product.printAllProducts(products);
	}
	
	public static Product[] order(Product[] products, int quantity) {
		for (int current = 0; current < quantity; current++) {
			int analyse = current;
			while(analyse > 0 && products[analyse].getPrice().compareTo(products[analyse-1].getPrice()) == -1) {
				changePosition(products, analyse, analyse-1);
				analyse--; //analyse goes till zero
			}
		}
		return products;
	}

	public static void changePosition(Product[] products, int first, int second) {
		Product firstProduct = products[first];
		Product secondProduct = products[second];
		products[first] = secondProduct;
		products[second] = firstProduct;
	}
}

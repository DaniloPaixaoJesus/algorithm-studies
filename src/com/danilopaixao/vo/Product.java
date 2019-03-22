package com.danilopaixao.vo;

import java.math.BigDecimal;

public class Product {
	private String name;
	private BigDecimal price;

	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}
	
	public static Product[] generateProducts() {
		Product[] products = {  new Product("product 1", new BigDecimal(500.00D)), 
								new Product("product 2", new BigDecimal(200.00D)),
								new Product("product 3", new BigDecimal(300.00D)), 
								new Product("product 4", new BigDecimal(600.00D)),
								new Product("product 4", new BigDecimal(1.00D)),
								new Product("product 5", new BigDecimal(400.00D)),
								new Product("product 5", new BigDecimal(10.00D)),
								new Product("product 6", new BigDecimal(50.00D)) 
							};
		return products;
	}

	public static void printProduct(Product product) {
			System.out.println("name: " + product.getName() + " price: " + product.getPrice());
	}
	
	public static void printAllProducts(Product[] products) {
		for (int i = 0; i < products.length; i++) {
			printProduct(products[i]);
		}
		System.out.println(" ");
	}
}
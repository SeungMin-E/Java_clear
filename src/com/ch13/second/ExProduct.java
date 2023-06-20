package com.ch13.second;

public class ExProduct {
	public static void main(String[] args) {
		
		product<String, Integer> product  = new product<>();
		
		product.setKind("Tony");
		product.setModel(100);
		
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		System.out.println("=====================================");
		
		product<Tv, String> product2 = new product<>();
		
		Tv tv = new Tv();
		
		product2.setKind(tv);
		product2.setModel("1221312");
		
		System.out.println(product2.getKind());
		System.out.println(product2.getModel());
		
	}
}

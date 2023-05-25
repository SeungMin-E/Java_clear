package com.company.study02;

public class ExPromotion {
	public static void main(String[] args) {
		
//		byte < short < int < long < float < double
		
		byte byteVar = 10;
		System.out.println("byteVar : " + byteVar);
		
		byte shortVar = byteVar;
		System.out.println("shortVar : " + shortVar);
		
		int intVar = byteVar;
		System.out.println("intVar : " + intVar);
		
		long longVar = byteVar;
		System.out.println("longVar : " + longVar);
		
		float floatVar = byteVar;
		System.out.println("floatVar : " + floatVar);
		
		double doubleVar = byteVar;
		System.out.println("doubleVar : " + doubleVar);
	}
}

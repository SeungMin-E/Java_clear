package com.ch03;

public class ExArithmeticOperator {
	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;	// 7
		int result2 = v1 - v2;	// 3
		int result3 = v1 * v2;	// 10
		int result4 = v1 / v2;	// 2
		int result5 = v1 % v2;	// 1
		double result6 = (double)v1 / v2;	// 평균을 계산할때 사용함.
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);
		
	}
}

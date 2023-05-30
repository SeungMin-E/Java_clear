package com.ch03;

public class ExLogicalOperator {
	public static void main(String[] args) {
		// ch03.08
		
		// 논리연산자
		// && = & : and : 논리곱 : 연산 참참참, 나머지 펄스
		// || = | : or : 논리합 : 연산 참 펄스 참, 폴스 참 참, 참 참 참, 펄스 펄스 펄스
		// ^ : 배타적 놀리합 : 연산 참 참 펄스, 펄스 펄스 펄스 펄스, 참 펄스 참, 펄스 참 참
		
		int a = 65;
		
		if(a >= 65 && a <= 70) {
			System.out.println("&& : True");
		}
		
		if(a >= 65 & a <= 70) {
			System.out.println("& : True");
		}
		
		if(a > 65 && a <= 70) {
			System.out.println("&& : True"); // 출력되지 않는다.
		}
		
		if(a > 65 || a <= 70) {
			System.out.println("|| : True"); 
		}
		
		if(a > 65 ^ a <= 70) {
			System.out.println("^1 : True"); 
		}
		
		if(a >= 65 ^ a <= 70) {
			System.out.println("^2 : True"); // 출력되지 않는다. 
		}
	}
}

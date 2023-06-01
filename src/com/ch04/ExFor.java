package com.ch04;

public class ExFor {
	public static void main(String[] args) {
		// 2단 부터 출력되는 구구단 프로그램을 작성하시요
		// 각단계마다 구분선을 넣어주세요.
		int a,b;
		
		
		for(int i = 2; i <= 9; i++) {
			
			for(a = 1; a <= 9; a++) {
				b = a * i;
				System.out.println( i+ " * " + a + " = " + b);
			}
			System.out.println("----------------------------------");
		}
		
	}
}

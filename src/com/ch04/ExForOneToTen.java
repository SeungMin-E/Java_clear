package com.ch04;

public class ExForOneToTen {
	public static void main(String[] args) {
		// 1부터 10까지 더하는 프로그램 작성
		
		int a = 1;
		int c;
		int sum = 0;
		
//		for(int i= 0; i < 10; i++) {
//			c = a + i;
//			System.out.println(c);
//			
//			sum = sum + c;
//		}
//		System.out.println(sum);
		System.out.println("경계 구분선===================================");
		
		// 11 ~ 50까지 짝수의 합을 구해라
		
		for(int i = 11; i <= 50; i++) {
			
			System.out.println(i);
			
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}

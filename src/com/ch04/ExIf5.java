package com.ch04;

public class ExIf5 {
	public static void main(String[] args) {
		
		// int 타입의 변수 3개 선언하고
		// 세 정수중에서 최대값, 최소값을 구하는 프로그램 작성
	
		int a, b, c;
		
		a = (int)(Math.random() * 100);
		b = (int)(Math.random() * 100);
		c = (int)(Math.random() * 100);
		
		System.out.println("a : " + a + " b : " + b + " c : " + c);
		
		if(a > b) {
			if(b > c) {
				System.out.println("최대값 :"+ a +" 최소값 : " + c );
			}else if(b < c) {
				if(a > c) {
					System.out.println("최대값 :"+ a +" 최소값 : " + b );
				}else if(a < c) {
					System.out.println("최대값 :"+ c +" 최소값 : " + b );
				}else {
					System.out.println("익셉션");
				}
			}
		}else if(a < b){
			if(a > c) {
				System.out.println("최대값 :"+ b +" 최소값 : " + c );
			}else if(a < c) {
				if(b > c) {
					System.out.println("최대값 :"+ b +" 최소값 : " + a );
				}else if(b < c) {
					System.out.println("최대값 :"+ c +" 최소값 : " + a );
				}else {
					System.out.println("익셉션");
				}
			}
		}else {
			System.out.println("인셉션");
		}
		
		
	}
}

package com.ch06.trgugu;

public class TrGuGu2 {
	
	public static void gugu(int num) {
		
		System.out.println("입력한 번호는 : " + num);
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		System.out.println("=================================================");
	}
}

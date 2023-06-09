package com.ch06.third;

public class ExArithmetic {
	public static void main(String[] args) {

		Arithmetic aris = new Arithmetic();
		
		int a = aris.add(2, 4);
		System.out.println("aris.add(2, 4) : " + a);
		
		int b = aris.minus(9, 10);
		System.out.println("aris.minus(9, 10) : "+ b);
		
		int c = aris.by(10, 10000);
		System.out.println("aris.by(10, 10000) : " + c);
		
		String d = aris.JackWonYoung("장원영");
		System.out.println(d);
		
		aris.JackWonYoung2("아이브");
		
		int e = aris.Pick();
		System.out.println(e + "원을 주웠습니다.");
	}
}

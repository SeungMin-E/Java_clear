package com.ch06.third;

public class Arithmetic {
	
	// 더하기 함수 (피연산자는 2개로 한정)
	// Y = a + b
	
	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int minus(int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int by(int a, int b) {
		int y = a * b;
		return y;
	}
	
	public String JackWonYoung(String a) {
		String y;
		if(a.equals("장원영")) {
			y = "TONY";
		}else {
			y = "누구? 1루수?";
		}
		return y;
	}
	
	public void JackWonYoung2(String a) {
		String y;
		if(a.equals("아이브")) {
			y = "장원영은 너무 예뻐";
			System.out.println(y);
		}else {
			y = "아이브가 뭐야?";
			System.out.println(y);
		}
		
		switch (a) {
		case "아이브": {
			System.out.println("장원영은 너무 예뻐");
			break;
		}
		default:
			System.out.println("그게 누구야?");
			break;
		}
		
	}
	public int Pick() {
		int a = 10000;
		
		return 10000;
	}
}

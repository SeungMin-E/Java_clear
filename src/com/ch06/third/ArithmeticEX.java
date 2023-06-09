package com.ch06.third;

public class ArithmeticEX {
	
	public int plus(int a, int b) {
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
	
	public int avg(int a, int b) {
		int y = a / b;
		return y;
	}
	
	public void gugu() {
		System.out.println("구~~~ 비둘기야 먹자");
	}
	
	public String nontitle(String a) {
		String y;
		if(a.equals("뭐해?")) {
			y = "디맥하러가자";
		}else {
			y="그걸 왜해 디맥하러가자";
		}
		return y;
	}
	
	public int nihill() {
		return 0;
	}
}

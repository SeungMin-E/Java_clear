package com.ch06.third;

public class ExArithmeticEX {
	public static void main(String[] args) {
	
		ArithmeticEX fail = new ArithmeticEX();
		
		int one = fail.plus(4 , 9);
		System.out.println(one);
		
		int mi = fail.minus(100,66);
		System.out.println(mi);
		
		int vi = fail.by(one, mi);
		System.out.println(vi);
		
		int avg = fail.avg(vi, mi);
		System.out.println(avg);
		
		String ans = fail.nontitle("뭐해?");
		System.out.println(ans);
		
		fail.nihill();
		System.out.println(fail.nihill());
		
		fail.gugu();
	}
}

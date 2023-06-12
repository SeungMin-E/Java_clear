package com.ch06.Fourth;

public class ExCalculator {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		double sqaureHole = calc.Sqaure(5);
		System.out.println("맞습니다. 정사각형입니다 : " + sqaureHole);
		
		double retangle = calc.Rectangle(5, 6);
		System.out.println("맞습니다. 정사각형입니다 : " + retangle);
		
	}
}

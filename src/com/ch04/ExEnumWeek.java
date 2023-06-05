package com.ch04;

public class ExEnumWeek {
	public static void main(String[] args) {
		
		int a = 1;
		Week week;
		String abc;
		
//		abc = Week.MONDAY;		// type mismatch(error)
		abc = Week.MONDAY.toString();
		
//		week = Week.MONDAY;
		
		System.out.println(abc);
	}
}

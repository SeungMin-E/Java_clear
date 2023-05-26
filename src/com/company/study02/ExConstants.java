package com.company.study02;

public class ExConstants {
	
	public static final String MY_NAME = "kane";
	public static final double PAI  = 3.14;
	
	
//	상수는 절대로 수정이 되지를 않는다.
	public static void main(String[] args) {
		
//		public static final String MY_NAME = "Tony";		// error
		
		System.out.println(MY_NAME);
		System.out.println(PAI);
		
//		MY_NAME = "Charle";	// error
	}
}

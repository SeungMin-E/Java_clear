package com.ch05;

public class ExArrayCreateByValueList {
	public static void main(String[] args) {
		
		/*
		 * double[] total; double avg[];
		 * 
		 * char[] grade;
		 * 
		 * boolean[] score; boolean score2[];
		 * 
		 */
		
		int[] socreChemistry = {100, 99, 98, 97, 96};
		
//		socreChemistry[5] = 95; -- 이건 안됨. // 컴파일 에러
		socreChemistry[0] = 95;
		socreChemistry[1] = 49;
		socreChemistry[2] = 49;
		socreChemistry[3] = 47;
		socreChemistry[4] = 48;
		
		
		int a = socreChemistry.length;
//		System.out.println(a);
//		
//		for(int i = 0; i < socreChemistry.length; i++) {
//		System.out.println(socreChemistry[i]);
//		}
//		
//		int a1 = 0;
//		while(a1 < socreChemistry.length) {
//			System.out.println(socreChemistry[a1]);
//			a1++;
//		}
//		System.out.println();
		
		String[] scoreStudent = {"한", "현", "진", "동","준"};
		
		char[] alpabet = {'A','B','C','D','E','F','G'};
		
		
//		
//		  for(int i = 0; i < alpabet.length; i++) {
//		  
//		  System.out.println(alpabet[i]); }
//		 
//		  System.out.println();
		
//		for(int bb: socreChemistry) {
//			System.out.println(bb);
//		}
//		System.out.println();

		int sum = 0;
		for(int cc : socreChemistry) {
			System.out.println(cc);
			sum = sum + cc;
		}
		
		System.out.println(sum);
	}
}

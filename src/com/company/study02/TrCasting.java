package com.company.study02;

public class TrCasting {
	public static void main(String[] args) {
		
//		double > float > long > int > short > byte
		
		double fourdallar = 4000;
		System.out.println("사딸라 : " + fourdallar);
		
		float fourdallar2 = (float)fourdallar;
		System.out.println("사딸라 : " + fourdallar2);
		
		long fourdallar3 = (long)fourdallar2;
		System.out.println("사딸라 : " + fourdallar3);
		
		int fourdallar4 = (int)fourdallar3;
		System.out.println("사딸라 : " + fourdallar4);
		
		short fourdallar5 = (short)fourdallar4;
		System.out.println("사딸라 : " + fourdallar5);
		
		byte fourdallar6 = (byte)fourdallar5;
		System.out.println("사딸라 : " + fourdallar6);
		
		
		System.out.println("----------------------------------------------------------");
		
		String fourdallar7 = String.valueOf(fourdallar4);
		System.out.println(fourdallar7);
		
		int fourdallar8 = Integer.parseInt(fourdallar7);
		System.out.println("오케이 땡큐! 오케이!" + fourdallar8 + "!");
	}
}

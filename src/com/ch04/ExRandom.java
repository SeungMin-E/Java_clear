package com.ch04;

public class ExRandom {
	public static  void main(String[] args) {
		
		int max = (int)(Math.random()*45)+1;
		int min = (int)(Math.random()*45)+1;
		int random = (int)(Math.random()*(max - min) + 1) ;
		
		System.out.println(random);
	}
}

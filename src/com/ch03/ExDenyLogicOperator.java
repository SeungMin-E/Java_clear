package com.ch03;

public class ExDenyLogicOperator {
	public static void main(String[] args) {
		
		// ch03.03
		
		// 논리부정연산자
		
		boolean play = false;
		
		play = !play;
		
		System.out.println(play);
		System.out.println("-------------------------------------------------------------------------------");
		
		int i = 3;
		
		if(!(i==3)) {
			System.out.println("무언가 좀 해야겠는걸?");
		}
	}
}

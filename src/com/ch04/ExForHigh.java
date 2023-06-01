package com.ch04;

public class ExForHigh {
	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********
		// 출력
		
//		for(int i=1; i<=5; i++) {
//			System.out.println("**********");
//		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("----------------------------");
		// **********
		// *        *
		// *        *
		// *        *
		// **********
		// 출력
//		
//		for(int i=1; i<=5; i++) {
//			if(i > 1 & i <= 4 ) {
//				System.out.println("*        *");
//			}else {
//				System.out.println("**********");	
//			}
//		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i>=2 & i<=4) {
					if(j>=2 & j<=9) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

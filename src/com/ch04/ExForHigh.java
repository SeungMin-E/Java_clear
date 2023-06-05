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
		
		System.out.println("----------------------------");
		
		
		int[] num = {1,2,3,4,5,6,7,8,9,0};
		
//		for(int i =0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i]; j++) {
				System.out.print(num[j]);
				if(num[j] < 10) {
					System.out.print("");
				}else {
					for(int k = 9; k <= num.length; k++) {
						if(num[k] % 2 == 0) {
							System.out.print(" ");
						}else {
							System.out.print(num[k]);
						}
					}
				}
			}
		
			System.out.println();
		}
		
		
		
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
	}
}

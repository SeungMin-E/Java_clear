package com.ch06.trgugu;

import java.util.Scanner;

public class TrGugu {
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void table(int a) {
		while(true) {
			if(a != 0) {
				for(int i = 1; i <= 9; i++) {
					System.out.println(a + " x " + i + " = " + a * i);
				}
				System.out.println("----------------------------------------------");
				
				System.out.print("숫자 입력 : ");
				a = scanner.nextInt();
			}else if(a == 0){
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("오류가 발생해서 정지합니다.");
				break;
			}
		}
	}
}

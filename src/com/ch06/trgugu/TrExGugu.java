package com.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// Scanner 객체 생성
		
		System.out.print("숫자 입력 : ");
		int result = scanner.nextInt();
//		System.out.println("result : " + result);
		
		
		TrGugu.table(result);
		
	}

}

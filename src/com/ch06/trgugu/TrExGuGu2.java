package com.ch06.trgugu;

import java.util.Scanner;

public class TrExGuGu2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("번호를 입력하세요 : ");
			int num = scanner.nextInt();
			if(num != 0) {
				TrGuGu2.gugu(num);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

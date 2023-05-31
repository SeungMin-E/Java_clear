package com.ch04;

public class ExIf3 {
	public static void main(String[] args) {
//		int 타입의 변수를 1개 선언하고
//		짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오
		
		int a = 0;
		
		if(a != 0) {
			if(a % 2 == 0) {
				System.out.println("입력하신 " + a +"은 짝수 입니다.");
			}else if(a % 2 == 1){
				System.out.println("입력하신 " + a +"은 홀수 입니다.");
			}
		}else {
			System.out.println(a + "은 판단 할 수가 없습니다.");
		}
	}
}

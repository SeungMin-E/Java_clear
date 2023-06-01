package com.ch04;

public class ExSwitch1 {
	public static void main(String[] args) {
		// 사장, 부장, 과장, 대리, 주임, 사원, 나
		// 사장의 연봉은 얼마입니다.
		
//		int position =
		int position = 7;
		
		switch(position) {
		case 1:
			System.out.println("사장님 연봉은 7000만원");
			break;
		case 2:
			System.out.println("부장님 연봉은 5000만원");
			break;
		case 3:
			System.out.println("과장님 연봉은 4500만원");
			break;
		case 4:
			System.out.println("대리님 연봉은 4100만원");
			break;
		case 5:
			System.out.println("주임님 연봉은 3800만원");
			break;
		case 6:
			System.out.println("사원님 연봉은 3200만원");
			break;
		case 7:
			System.out.println("저의 연봉은 3000만원 입니다");
			break;
		default:
			System.out.println("없는 분인데.... 누구지?");
			break;
		}
	}
}

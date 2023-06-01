package com.ch04;

public class ExIfTr {
	public static void main(String[] args) {
		
		// if 학점 계산 (추가로 A+:100~97 A:96~94 A-:93~90 분류)
		// A:90
		// B:89~80
		// C:79~70
		// D:69~60
		// F:59
		
		int score = (int)(Math.random() * 100);
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("A+");
			}else if(score >= 94) { 
				System.out.println("A");
			}else {
				System.out.println("A-");
			}
		}else if(score >= 80) {
			if(score >= 87) {
				System.out.println("B+");
			}else if(score >= 84) {
				System.out.println("B");
			}else {
				System.out.println("B-");
			}
		}else if(score >= 70) {
			if(score >= 77) {
				System.out.println("C+");
			}else if(score >= 74) {
				System.out.println("C");
			}else {
				System.out.println("C-");
			}
		}else if(score >= 60) {
			if(score >= 67) {
				System.out.println("D+");
			}else if(score >= 64) {
				System.out.println("D");
			}else {
				System.out.println("D-");
			}
		}else {
			System.out.println("F");
		}
		
		// 일반 : 1, 5% 할인적용
		// 브론즈 : 2, 10% 할인적용
		// 실버 : 3, 15% 할인적용
		// 골드 : 4, 20% 할인적용
		// 플래티넘 : 5, 2.7% 할인 적용
				
		// 정가 12,000원인 실버등급의 할인가는 : 10,200원 입니다.
		
		int cost = 12000;
		int resultCost;
		int rank = (int)(Math.random() * 4) + 1;
		String visitor; 
		
		if(rank == 5) {
			visitor = "플래티넘 등급";
			resultCost = cost - (int)(cost * 0.027);
			System.out.println("정가 " + cost + "원인 " + visitor + "의 할인 적용 값은 " + resultCost + "원 입니다.");
		}else if(rank == 4 ) {
			visitor = "골드 등급";
			resultCost = cost - (int)(cost * 0.2);
			System.out.println("정가 " + cost + "원인 " + visitor + "의 할인 적용 값은 " + resultCost + "원 입니다.");
		}else if(rank == 3) {
			visitor ="실버 등급";
			resultCost = cost - (int)(cost * 0.15);
			System.out.println("정가 " + cost + "원인 " + visitor + "의 할인 적용 값은 " + resultCost + "원 입니다.");
		}else if(rank == 2) {
			visitor = "브론즈 등급";
			resultCost = cost - (int)(cost * 0.1);
			System.out.println("정가 " + cost + "원인 " + visitor + "의 할인 적용 값은 " + resultCost + "원 입니다.");
		}else if(rank == 1) {
			visitor = "일반 등급";
			resultCost = cost - (int)(cost * 0.05);
			System.out.println("정가 " + cost + "원인 " + visitor + "의 할인 적용 값은 " + resultCost + "원 입니다.");
		}else {
			System.out.println("죄송하지만 회원이 아니시면 구매가 불가능합니다.");
		}
		
//		int 타입의 변수를 1개 선언하고
//		짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오
		
		int num = (int) (Math.random() * 99);
		
		if(num != 0) {
			if(num % 2 == 0) {
				System.out.println(num + "은(는) 짝수");
			}else {
				System.out.println(num + "은(는) 홀수");
			}
		}else {
			System.out.println("0 넣으면 홀짝을 어떻게 하니....");
		}
	}
}

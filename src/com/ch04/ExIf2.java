package com.ch04;

public class ExIf2 {
	public static void main(String[] args) {
		
		// 일반 : 1, 5% 할인적용
		// 브론즈 : 2, 10% 할인적용
		// 실버 : 3, 15% 할인적용
		// 골드 : 4, 20% 할인적용
		// 플래티넘 : 5, 2.7% 할인 적용
		
		// 정가 12,000원인 실버등급의 할인가는 : 10,200원 입니다.
		
		int rank = 3; 	// 실버등급
		int val = 12000;	// 정가
		
		int result;		// 할인율 적용된 할인금액
		String rankName;	// 등급명
		
		if(rank == 5) {
			rankName = "플래티넘" ;
		}else if(rank == 4) {
			rankName = "골드" ;
		}else if(rank == 3) {
			rankName = "실버";
		}else if(rank == 2) {
			rankName = "브론즈";
		}else {
			rankName = "일반";
		}
		
		if(rank == 5) {
			result = val - (int) (val * 0.027) ;
			System.out.println("정가 " + val +"원인 " + rankName +" 등급의 할인가는 : " +  result + "원 입니다." );
		}else if(rank == 4) {
			result = val -  (int) (val * 0.2);
			System.out.println("정가 " + val +"원인 " + rankName +" 등급의 할인가는 : " +  result + "원 입니다." );
		}else if(rank == 3) {
			result = val -  (int) (val * 0.15);
			System.out.println("정가 " + val +"원인 " + rankName +" 등급의 할인가는 : " +  result + "원 입니다." );
		}else if(rank == 2) {
			result = val -  (int) (val * 0.1);
			System.out.println("정가 " + val +"원인 " + rankName +" 등급의 할인가는 : " +  result + "원 입니다." );
		}else {
			result = val -  (int) (val * 0.05);
			System.out.println("정가 " + val +"원인 " + rankName +" 등급의 할인가는 : " +  result + "원 입니다." );
		}
		
		int grade = 3;
		int cost = 12000;
		double salesCost = 0.0;
		
		if(grade == 1) {
			salesCost = cost * (1-0.05);
			System.out.println("정가가 " + cost + "원인 일반등급의 할인가는 : " + (int)salesCost + "원 입니다.");
		}else if(grade == 2) {
			salesCost = cost * (1-0.1);
			System.out.println("정가가 " + cost + "원인 브론즈등급의 할인가는 : " + (int)salesCost + "원 입니다.");
		}else if(grade == 3) {
			salesCost = cost * (1-0.15);
			System.out.println("정가가 " + cost + "원인 실버등급의 할인가는 : " + (int)salesCost + "원 입니다.");
		}else if(grade == 4) {
			salesCost = cost * (1-0.2);
			System.out.println("정가가 " + cost + "원인 골드등급의 할인가는 : " + (int)salesCost + "원 입니다.");
		}else if(grade == 5) {
			salesCost = cost * (1-0.027);
			System.out.println("정가가 " + cost + "원인 플래티넘등급의 할인가는 : " + (int)salesCost + "원 입니다.");
		}else {
			System.out.println("1~5까지의 등급만 가능합니다.");
		}
	}
}

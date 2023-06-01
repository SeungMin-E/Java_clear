package com.ch04;

public class ExForTr {
	public static void main(String[] args) {
		
		// int 타입의 변수를 2개 선언하고(if)
		// 두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시요.
		
		int a = 1;
		int b = -10;
		
		if(a!=0 && b!=0) {
			if(a >= 0 && b >= 0) {
				System.out.println("해당 위치는 1사분면입니다.");
			}else if(a <= 0 && b >= 0) {
				System.out.println("해당 위치는 2사분면입니다.");
			}else if(a <= 0 && b <= 0) {
				System.out.println("해당 위치는 3사분면입니다.");
			}else if(a >= 0 && b <=0 ) {
				System.out.println("해당 위치는 4사분면입니다.");
			}
		}else if(a==0 && b!=0) {
			System.out.println("해당 위치는 x축에 있습니다.");
		}else if(a!=0 && b==0) {
			System.out.println("해당 위치는 y축에 있습니다.");
		}else {
			System.out.println("해당 위치는 중심점에 있습니다.");
		}
		
		// int 타입의 변수 3개 선언하고(if)
		// 세 정수중에서 최대값, 최소값을 구하는 프로그램 작성
		int c,d,e;
		c = (int)(Math.random() * 99) + 1;
		d = (int)(Math.random() * 99) + 1;
		e = (int)(Math.random() * 99) + 1;
		
		if(c != d | d != e | e != c) {
			if(c > d) {
				if(d > e) {
					System.out.println("최대값 : " + c + " 최소값" + e);
				}else if(d < e) {
					if(c > e) {
						System.out.println("최대값 : " + c + " 최소값" + d);
					}else if(c < e) {
						System.out.println("최대값 : " + e + " 최소값" + d);
					}else {
						System.out.println("error");
					}
				}else {
					System.out.println("error");
				}
			}else if(c < d) {
				if(c > e) {
				}else {
					
				}
			}
		}else {
			System.out.println("똑같은 숫자가 2개네요.. 나눌수는 있지만은...");
		}
		
		// 사장, 부장, 과장, 대리, 주임, 사원, 나 (switch)
		// 사장의 연봉은 얼마입니다.
		
		// 1부터 10까지 더하는 프로그램 작성(for)
		
		// 1부터 10까지 더하는 프로그램 작성(while)
		
		// 2단 부터 출력되는 구구단 프로그램을 작성하시요(for)
		// 각단계마다 구분선을 넣어주세요.
		
		// **********
		// **********
		// **********
		// **********
		// **********
		// 출력(for)
		
		
		// **********
		// *        *
		// *        *
		// *        *
		// **********
		// 출력(for)
		
	}
}

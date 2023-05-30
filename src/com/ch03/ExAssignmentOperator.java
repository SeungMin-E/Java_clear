package com.ch03;

public class ExAssignmentOperator {
	public static void main(String[] args) {
		// ch03.09
		
		// 대입 연산자 (+=, -+, *= ....)
		
		int result = 1;
		int result2 = 2;
		int result3 = 3;
		
//		장원영 강사님 해석법
		result += 10;
//		result = result + 10;
		System.out.println("result : " + result);
		
		result2 -= 10;
//		result2 = result2 - 10;
		System.out.println("result2 : " + result2);
		
		result3 *= 10;
//		result3 = result3 * 10;
		System.out.println("result3 : " + result3);
	}
}

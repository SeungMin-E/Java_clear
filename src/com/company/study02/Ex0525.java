package com.company.study02;

public class Ex0525 {
	public static void main(String[] args) {
		// ExBoolean.java
		boolean a = true;
		boolean b;
		
		if(a) {
			System.out.println("맞습니다. 그건 원이죠");
		}else {
			System.out.println("아닙니다. 그건 원이죠");
		}
		
		if(b = a)
		{
			System.out.println("맞습니다. 그건 원이죠");
		}else {
			System.out.println("아닙니다. 그건 원이죠");
		}
		
		if(b= false) {
			System.out.println("맞습니다. 그건 원이죠");
		}else {
			System.out.println("아닙니다. 그건 원이죠");
		}
		
		// ExByte.java
		byte a1 = 127;
		byte b1 = (byte)128;
		byte c1 = -128;
//		byte d1 = -129; byte는 -128 ~ 127
		
		System.out.println(a1 = (byte) (b1 - c1)); // byte + byte = int형이 된다.(캐스팅을 하거나 변수를 다르게 선언해라)
		
		// ExChar.java
		char a2 = 'A';		// 일반문자
		char b2 = 44032;	// 아스키코드(10진수)
		char b2_2 = 65;	// 아스키코드(10진수)
		char c2 = '\u0041';	// 16진수
//		char d2 = 'AA' 이건 안됨
		
		System.out.println(a2 + b2 + c2); // 합치면 변수가 바뀐다.
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(b2_2);
		System.out.println(c2);
		
		
		// ExFloatDouble.java
		float a3 = 10;
		float c3 = 3.14f;
		double d3 = 3.14;
		double b3 = 20;
		
		System.out.println(a3);
		System.out.println(c3);
		System.out.println(b3);
		System.out.println(d3);
		
		// ExInt.java
		int intVar1 = (int)c3;
		int a4 = 10;
		System.out.println(intVar1);
		
		
		// ExLong.java
		
		// ExPromtion.java
	}
}

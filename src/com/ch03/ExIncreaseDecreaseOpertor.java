package com.ch03;

public class ExIncreaseDecreaseOpertor {
	public static void main(String[] args) {
		
		// ch03.02
		
		// 증감연산자(++, --)
		
		int i = 0;
		int j = 0;
		
		i++;
		++j;
		
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		
		int a = 1;
		int b = 1;
		
		a--;
		--b;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		int k = i++;
		int l = ++j;
		
		System.out.println("k : " + k);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("j : " + j);
		System.out.println("------------------------------------------------------------------------------------");
		
		--i;
		int z = ++i + j++;
		
		System.out.println("z : " + z);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		/*
		 * i = 1 j = 2
		 * z = 4
		 * i = 2
		 * j = 3
		 * 
		 */
	}
}

package com.test;

import java.util.Scanner;

public class ComputerExample {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요 : ");
		int a = scanner.nextInt();
		System.out.println("");
		
		System.out.println("원의 반지름 : " + a);
		
		calculator.param(a);
		computer.param(a);
		
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + calculator.param(a));
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + computer.param(a));
	}
}

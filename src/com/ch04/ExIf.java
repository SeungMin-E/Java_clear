package com.ch04;

public class ExIf {
	public static void main(String[] args) {
		// ch04.01
		
		// if 학점 계산
		// A:90
		// B:89~80
		// C:79~70
		// D:69~60
		// F:59
		
		int score = 65;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("당신의 학점은 : A+");
			}else if(score >= 94) {
				System.out.println("당신의 학점은 : A");
			}else {
				System.out.println("당신의 학점은 : A-");
			}
		}else if(score >= 80) {
			if(score >= 87) {
				System.out.println("당신의 학점은 : B+");
			}else if(score >= 84) {
				System.out.println("당신의 학점은 : B");
			}else {
				System.out.println("당신의 학점은 : B-");
			}
		}else if(score >= 70) {
			if(score>=77) {
				System.out.println("당신의 학점은 : C+");
			}else if(score >= 74) {
				System.out.println("당신의 학점은 : C");
			}else {
				System.out.println("당신의 학점은 : C-");
			}
		}else if(score >= 60) {
			if(score >= 67) {
				System.out.println("당신의 학점은 : D+");
			}else if(score >= 64) {
				System.out.println("당신의 학점은 : D");
			}else {
				System.out.println("당신의 학점은 : D-");
			}
		}else {
			System.out.println("당신의 학점은 : F");
		}
	}
}

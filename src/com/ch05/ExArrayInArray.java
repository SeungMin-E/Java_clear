package com.ch05;

public class ExArrayInArray {
	public static void main(String[] args) {

//		kor, eng, math 과목별 총합과 평균
//		사람별 총합과 평균
		String[] name = {"장동건", "차태식", "마동석", "마장동", "마해영"};
		
		int[][] score = {{11,22,33},{44,55,66},{77,88,99},{100,100,100},{80,40,30}};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++ ) {
				System.out.println("score["+i+"]["+j+"]"+score[i][j]);
			}
		}
		System.out.println("-----------------------------------------------------------------------");
		
		int sum = 0;

		double avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum = 0;
			for(int j = 0; j < score[i].length; j++) {
				System.out.println("score["+i+"]["+j+"]"+score[i][j]);
				if(i == 0) {
					sum += score[0][j];
				}else if(i == 1){
					sum += score[1][j];
				}else if(i == 2){
					sum += score[2][j];
				}else if(i == 3){
					sum += score[3][j];
				}else if(i == 4){
					sum += score[4][j];
				}
			}
			avg = sum/3;
			
			System.out.print("총 점 : "+ sum);
			System.out.println(" 평균 : " + avg);
		}
	}
}

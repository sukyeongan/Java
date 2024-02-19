package ch04.unit01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 점수를 입력 받아 평점 구하기
		Scanner sc = new Scanner(System.in);
		int s;
		double grade;
		
		System.out.print("점수 ? ");
		s = sc.nextInt();
		
		if(s >= 0 && s <= 100) {
			if(s >= 95) {
				grade = 4.5;
			} else if(s >= 90) {
				grade = 4.0;
			} else if(s >= 85) {
				grade = 3.5;
			} else if(s >= 80) {
				grade = 3.0;
			} else if(s >= 75) {
				grade = 2.5;
			} else if(s >= 70) {
				grade = 2.0;
			} else if(s >= 65) {
				grade = 1.5;
			} else if(s >= 60) {
				grade = 1.0;
			} else {
				grade = 0.0;
			}
			
			System.out.printf("점수 : %d, 평점 : %.1f\n", s, grade);
		} else {
			System.out.println("점수 입력 오류 입니다.");
		}

		sc.close();
	}

}

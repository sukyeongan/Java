package ch04.unit01;

import java.util.Scanner;

public class Ex02_if {

	public static void main(String[] args) {
		// 정수를 입력 닫아 홀수인지 판별
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		/*
		if(n % 2 == 1) {
			s = "홀수";
		}
		System.out.println(n + " => " + s); // 컴파일 오류. 
						// s가 초기화가 안됨
		*/
		
		s = "홀수가 아니다.";
		if(n % 2 == 1) {
			s = "홀수";
		}
		System.out.println(n + " => " + s);
		
		sc.close();

	}

}

package ch04.unit02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정수 ? ");
		n = sc.nextInt();
		
		// default : case 조건에 만족하는 것이 없는 경우 실행. 위치는 상관 없음
		switch(n) {
		case 3 : System.out.println("***");break;
		case 2 : System.out.println("**");break;
		case 1 : System.out.println("*");break;
		default : System.out.println("입력 오류..."); break;
		}
		
		sc.close();

	}

}

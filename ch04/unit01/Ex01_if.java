package ch04.unit01;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {
		// 정수를 입력 받아 절대값 구하기
		Scanner sc = new Scanner(System.in);
		int n, a;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		a = n;
		if(n < 0) { // if 조건을 만족한 경우 실행할 문이 하나인 경우 {} 생략가능
			a = -n;
		}
		
		System.out.println(n + "의 절대 값 : " + a);
		
		sc.close();
	}
}

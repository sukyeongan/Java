package ch04.unit01;

import java.util.Scanner;

public class Ex04_if {

	public static void main(String[] args) {
		// 3개의 숫자를 입력 받아 적은수에서 큰수 순서로 출력하기
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("세개의 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int t;
		if(a > b) {
			t = a; a = b; b = t;
		}
		if(a > c) {
			t = a; a = c; c = t;
		}
		if(b > c) {
			t = b; b = c; c = t;
		}
		
		System.out.printf("%d %d %d\n", a, b, c);
		sc.close();

	}
}

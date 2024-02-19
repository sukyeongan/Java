package ch04.unit01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// 두정수와 연산자를 입력 받아 연산하는 프로그램
		Scanner sc = new Scanner(System.in);
		int a, b;
		char c;
		
		System.out.print("두정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자[+, -, *, /] ? ");
		c = sc.next().charAt(0);
		
		if(c=='+'||c=='-'||c=='*'||c=='/') {
			int result;
			if(c == '+') {
				result = a + b;
			} else if(c == '-') {
				result = a - b;
			} else if(c == '*') {
				result = a * b;
			} else {
				result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, c, b, result);
			
		} else {
			System.out.println("연산자 입력 오류 입니다.");
		}
		
		sc.close();
	}
}

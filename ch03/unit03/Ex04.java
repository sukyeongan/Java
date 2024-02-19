package ch03.unit03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("a:" + a + ", b:" + b);
		
		/*
		// 두 변수값 바꾸는 방법 1
		int c;
		c = a; a = b; b = c;
		*/
		
		// 두 변수값 바꾸는 방법 2
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		
		System.out.println("a:" + a + ", b:" + b);
		
		sc.close();
	}

}

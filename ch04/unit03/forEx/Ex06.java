package ch04.unit03.forEx;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 정수를 입력 받아 1~입력 받은 수 까지 짝수합 구하기
		Scanner sc = new Scanner(System.in);
		
		int a, n, s;
		System.out.print("수 ? ");
		a = sc.nextInt();
		
		//짝수 합의 값 구하기
		// 잘못 코딩한 예 ; while문장은 문제가 비일비재
		n=s=0;
		while(n < a) {
			n+=2;
			s+=n;
		}
		
		System.out.println("결과:" + s);
		
		/*
		s = 0;
		n = 2;
		while(n <= a) {
			s+=n;
			n+=2;
		}

		System.out.println("결과:" + s);
		
		s = 0;
		for(n = 2; n<=a; n+=2) {
			s += n;
		}
		*/
		sc.close();

	}

}

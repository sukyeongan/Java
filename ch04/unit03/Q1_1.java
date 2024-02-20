package ch04.unit03;

import java.util.Scanner;

public class Q1_1 {

	public static void main(String[] args) {
		// 문제1 정수를 입력 받아 1부터 입력 받은 수까지의 합, 짝수 합, 홀수 합을 구하는 프로그램을 작성하시오.

		// 1부터 입력받은 수까지의 합 구하기

		Scanner sc = new Scanner(System.in);
		int num, n, s;

		System.out.print("정수 ?");
		num = sc.nextInt();

		s = 0;
		n = 0;

		while (n <= num) {
			s += n;
			n++;
		}
		System.out.println("결과 : " + s);
		sc.close();
	}

}


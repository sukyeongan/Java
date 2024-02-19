package ch04.unit01;

import java.util.Scanner;

public class Ex06_if {

	public static void main(String[] args) {
		// 정수를 입력 받아 2와 3의 배수인지 아니면 2의 배수 또는 3의 배수인지 출력
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		// 잘못 코딩한 예
		/*
		if(n%2 == 0) {
			System.out.println(n + " => 2의 배수");
		} else if(n%3 == 0) {
			System.out.println(n + " => 3의 배수");
		} else if(n%2 == 0 && n%3 == 0) {
			System.out.println(n + " => 2와 3의 배수");
		} else {
			System.out.println(n + " => 2 또는 3의 배수가 아니다.");
		}
		*/

		if(n%2 == 0 && n%3 == 0) {
			System.out.println(n + " => 2와 3의 배수");
		} else if(n%2 == 0) {
			System.out.println(n + " => 2의 배수");
		} else if(n%3 == 0) {
			System.out.println(n + " => 3의 배수");
		} else {
			System.out.println(n + " => 2 또는 3의 배수가 아니다.");
		}
		
		sc.close();

	}

}

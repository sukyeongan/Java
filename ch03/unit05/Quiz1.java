package ch03.unit05;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// 두수를 입력 받아 입력 받은 수 사이의 정수의 개수 구하기
		// 모두 양수를 입력 한다는 가정하에 문제 해결
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		int n;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		n = (a > b ? a-b : b-a) + 1;
		
		System.out.printf("%d ~ %d 사이의 정수의 개수 : %d\n", a, b, n);
		
		sc.close();
	}
}

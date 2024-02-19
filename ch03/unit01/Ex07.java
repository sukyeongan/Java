package ch03.unit01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 반지름(실수)을 입력 받아 원의 넓이, 둘레 계산
		// 넓이 = 반 * 반 * 3.14
		// 둘레 = 반 * 2 * 3.14
		Scanner sc = new Scanner(System.in);
		
		double radius;
		double area, len;
		double PI = 3.141592;
		
		System.out.print("반지름 ? ");
		radius = sc.nextDouble();
		
		area = radius * radius * PI;
		len = radius * 2 * PI;
		
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + len);
		
		sc.close();

	}

}

package ch03.unit01;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// 섭씨온도를 입력 받아 화씨 온도로 변환하기
		// 화씨온도 = 섭씨온도 * 1.8 + 32
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		double b;
		
		System.out.print("섭씨온도 ? : ");
		
		a = sc.nextInt();
		b = a * 1.8 + 32;
		
		System.out.println("화씨온도 : " + b );
	
		sc.close();

	}

}

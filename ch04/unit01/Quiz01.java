package ch04.unit01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 두수를 입력 받아 큰수에서 적은수 차이 구하기
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("첫번째 수 ? ");
		a = sc.nextInt();
		System.out.print("두번째 수 ? ");
		b = sc.nextInt();
		
		if( a > b) {
			c = a - b;
		} else {
			c = b - a;
		}
		
		System.out.println("두수의 차이 : " + c);
		
		sc.close();
	}

}

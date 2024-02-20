package ch04.unit03;

import java.util.Scanner;

public class Q1_2 {

	public static void main(String[] args) {
		// 1부터 입력받은 수까지의 짝수끼리의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		int n,s,num;
		
		System.out.print("정수 ? ");
		num = sc.nextInt();
		
		n = 1;
		s = 0;
		
		while(n<=num) {
			s +=n;
			n +=2;

			}
		System.out.println("결과 : " + s);
		sc.close();
	}

}

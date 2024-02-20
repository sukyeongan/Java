package ch04.unit03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 1~100 까지의 홀수 합
		
//		int n ,s;
//		n = 1;
//		s = 0;
//		while(n<100) {
//			n +=2;
//			s +=n;
//		}
//		System.out.println("결과 : " + s); //이건 3부터 101까지 더하는 것
		
		
//		int n, s;
//		s = 0;
//		n = 1;
//		while (n < 100) {
//			s += n;
//			n += 2;
//		}
//		System.out.println("결과 : " + s);//이게 정답
		
		
		
		//양의 정수를 입력 받아 1~입력 받은 수까지 홀수까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		int num, n, s;
		
		System.out.print("정수 ? ");
		num = sc.nextInt();

		s = 0;
		n = 1;
		while (n <= num) {
			s += n;
			n += 2;
		}
		System.out.println("결과 : " + s);
	
		sc.close();
	}
	
}

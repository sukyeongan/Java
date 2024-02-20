package ch04.unit04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 실수를 입력 받아 입력 받은 실수의 합구하기
		// 단, 입력 받은 수가 0인 경우 합을 출력하고 종료
		Scanner sc = new Scanner(System.in);
		
		double input, s;
		
		s = 0;
		System.out.println("실수입력[종료:0]"); //실수입력 1번 나옴
		while(true) {
			// System.out.println("실수입력[종료:0]"); 0이 아닌 실수를 입력했을 때 반복 출력
			input = sc.nextDouble();
			if(input == 0) {
				break;
			}
			s += input;
		}

		System.out.println("결과 : " + s);
		
		sc.close();
	}

}

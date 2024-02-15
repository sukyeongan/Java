package ch02.unit03;

import java.util.Scanner;

public class Quiz1 {

	
	//문제1) 한문자를 입력 받아 입력받은 문자의 ASCII코드 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c;
		int n;
		
		// 한문자를 입력 받는다.
		System.out.print("문자 ?");
		c = sc.next().charAt(0);
		
		// 입력 받은 문자의 코드 값을 구하고 출력한다.
		n = c;
		System.out.printf("%c => %d\n", c, n );
		
		sc.close();
	}

}

		


package ch02.unit03;

import java.util.Scanner;

// 10 ~ 200 사이의 ASCII 코드(정수)를 입력 받아 입력 받은 코드에 해당하는 문자 출력
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("10 ~ 200 사이의 ASCII 코드 ? ");
		n = sc.nextInt();
		
		System.out.printf("%d => %c\n", n, n);
		
		sc.close();
	}
}

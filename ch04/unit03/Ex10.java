package ch04.unit03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 입력 받은 수의 구구단 출력
		Scanner sc = new Scanner(System.in);
		int dan;
		int n;
		
		System.out.print("원하는 단 ?");
		dan = sc.nextInt();
		
		n = 0;
		while(n<9) {
			n++;
			System.out.printf("%d*%d = %d\n", dan, n, dan*n);
		}
		sc.close();
	}

}

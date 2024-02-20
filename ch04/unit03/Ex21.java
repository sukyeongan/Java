package ch04.unit03;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// 단을 입력 받아 입력 받은 수의 구구단 출력
		// 단, 입력 받은 단이 1~9 사이의 수가 아니면 다시 입력 받는다.

		Scanner sc = new Scanner(System.in);
		int dan, n;
		
		do {
			System.out.print("단[1~9] ? ");
			dan = sc.nextInt();
		} while(dan <1 || dan > 9);
		
		n = 0;
		while(n<9) {
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, dan*n);
		}
		
		sc.close();
	}

}

// while은 조건을 먼저 비교하고 들어오지만 do while은 입력을 먼저 받음

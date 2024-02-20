package ch04.unit03.forQuizAnswer;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, s;
		
		do {
			System.out.print("수 ? ");
			num = sc.nextInt();
		}while(num < 1 || num > 1000);
		
		sc.close();
		
		s = 0;
		for(int n = 1; n<=num; n++) {
			s += n;
		}
		System.out.printf("1~%d 까지 합 : %d\n", num, s);

	}

}

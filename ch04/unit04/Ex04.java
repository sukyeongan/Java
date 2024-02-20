package ch04.unit04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int n, s;
		int start, step;
		String msg;
		
		while(true) {
			do {
				System.out.print("1.합 2.짝수합 3.홀수합 4.종료 => ");
				ch = sc.nextInt();
			}while(ch<1 || ch>4 );
			
			if(ch == 4) {
				break;
			}
			
			do {
				System.out.println("수 ? ");
				n = sc.nextInt();
			}while(n<1);
		}
		sc.close();
	}
}

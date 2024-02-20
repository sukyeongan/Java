package ch04.unit04;

import java.util.Scanner;

public class Ex04_prac {

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
			
			s = 0;
			if(ch == 1) {
				start = 1; step = 1;
				msg = "합";				
			} else if(ch ==2) {
				start = 2; step = 2;
				msg = "짝수합";
			} else {
				start = 1; step = 2;
				msg = "홀수합";
			}
			
			for(int i = start; i<=n; i+=step) {
				s += i;
			}
			System.out.println(msg + " : " + s);
		}
		sc.close();
	}
}

package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan,n;
		
		do {
			System.out.print("단 ? :");
			dan= sc.nextInt();
		} while(dan < 1 || dan > 10);
		
		sc.close();
		
		for(n=1;n<=9;n++) {
			System.out.printf("%d * %d = %d\n" , dan,n,dan*n);
		}
		
		
		sc.close();

	}

}

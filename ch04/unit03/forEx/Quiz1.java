package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("수 ?");
			num = sc.nextInt();
		}while(num < 1 || num > 1000);
		
		sc.close();
		
		
		
		
	}

}

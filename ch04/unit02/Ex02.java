package ch04.unit02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1~3사이 정수 ?");
		n = sc.nextInt();
		
		switch (n) {
		case 3: System.out.print("*");
				System.out.print("#");
				System.out.print("&");
				break; // break를 만나면 switch ~ case를 빠져나옴
		case 2: System.out.print("*");
				System.out.print("#");	
				break;
		case 1: System.out.print("*");
		}
		System.out.println();
		
		sc.close();
	
	}

}

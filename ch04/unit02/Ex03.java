package ch04.unit02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정수 ? ");
		n = sc.nextInt();
		
		switch(n % 3) {
		case 0 : System.out.println(n + " : 3의 배수");
				break;
		case 1 : 
		case 2 : System.out.println(n + " : 3의 배수가 아님");
				break; //마지막 break는 생략 가능
		}
		
		sc.close();

	}

}

package ch04.unit02;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b ;
		String g;
		
		System.out.print("두수 ?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("연산자[+,-,*,/] ?");
		g = sc.next();
		
		switch(g) {
		case "+" : System.out.printf("%d+%d = %d\n", a, b, a+b );break;
		case "-" : System.out.printf("%d-%d = %d\n", a, b, a-b );break;
		case "*" : System.out.printf("%d*%d = %d\n", a, b, a*b );break;
		case "/" : System.out.printf("%d/%d = %d\n", a, b, a/b );break;
		default : System.out.printf("연산자 입력 오류.");break;
		

		}
		sc.close();
	}
}

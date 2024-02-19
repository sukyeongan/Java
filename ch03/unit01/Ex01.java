package ch03.unit01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// int a = 13, b = 5;
		int a, b;
		int c, d, e, f, g;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		
		System.out.printf("%d + %d = %d\t", a, b, c);
		System.out.printf("%d - %d = %d\n", a, b, d);
		System.out.printf("%d * %d = %d\t", a, b, e);
		System.out.printf("%d / %d = %d\n", a, b, f);
		System.out.printf("%d %% %d = %d\n", a, b, g);
		
		sc.close();

	}

}

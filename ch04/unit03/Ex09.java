package ch04.unit03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, n, s;
		
		System.out.print("수 ? ");
		num = sc.nextInt();
		
		s = n= 0;
		while(n<num) {
			n++;
			s += n;
	}
	System.out.println("결과 : " + s);
	
	sc.close();
	}
}

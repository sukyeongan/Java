package ch04.unit03.forEx;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, s;
		
		System.out.println("수 ? ");
		a = sc.nextInt();
	
		s = 0;
		for(int n=1; n<=a; n+=2) {
			s+=n;
		}
		System.out.println("결과:"+s);
		
		sc.close();

	}

}

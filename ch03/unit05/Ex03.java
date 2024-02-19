package ch03.unit05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 정수 입력 받아 양수, 음수, 영 인지 판별
		Scanner sc = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		s = n > 0 ? "양수" : (n == 0 ? "영" : "음수");
		
		System.out.println(n + " => " + s);
		
		sc.close();
	}

}

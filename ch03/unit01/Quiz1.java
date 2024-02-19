package ch03.unit01;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// 초를 입력 받아 시, 분, 초로 변환
		Scanner sc = new Scanner(System.in);
		
		int a, h, m, s;
		
		System.out.print("초를 입력하세요 ? ");
		a = sc.nextInt();
		
		h = a / 3600;
		m = (a / 60) % 60;		
		s = a % 60;
		
		System.out.println(h + ", " + m + ", " + s);
		
		sc.close();
	}
}

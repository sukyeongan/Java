package ch04.unit02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m;
		
		System.out.print("년도 ?");
		y = sc.nextInt();
		System.out.println("월 ? ");
		m = sc.nextInt();
		
		// 강화된 switch~case. JDK 14 부터 표준
		switch(m) {
		case 1,3,5,7,8,10,12 -> System.out.println(y+"년"+m+"월의 마지막 날짜는 31일");
		case 4,6,9,11 -> System.out.println(y+"년"+m+"월의 마지막 날짜는 30일");
		case 2-> {
				int d = y%4==0&&y%100!=0||y%400==0?29:28;
				System.out.println(y+"년"+m+"월의 마지막 날짜는 " + d + "일");
			}
		default -> System.out.println("날짜 입력 오류...");
		}
		
		sc.close();
	}

}

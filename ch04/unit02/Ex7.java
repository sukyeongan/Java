package ch04.unit02;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.print("년도 ?");
		y = sc.nextInt();
		System.out.println("월 ? ");
		m = sc.nextInt();
		
		// 강화된 switch~case. JDK 14 부터 표준
		d = switch(m) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2-> {
				d = y%4==0&&y%100!=0||y%400==0?29:28;
				yield d; //block 에서만 yield 사용 가능. yield를 써야 값을 되돌릴 수 있음
			}
		default -> -1;
		}; // 스위치 표현식은 마지막에 ; 이 필요

		if(d == -1) {
			System.out.println("날짜 입력 오류...");
		} else {
			System.out.printf("%d년 %d월의 마지막일자는 %d일\n,y,m,d");
		}
		
		sc.close();
	}

}

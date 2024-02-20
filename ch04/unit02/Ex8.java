package ch04.unit02;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m;
		
		System.out.print("년도 ?");
		y = sc.nextInt();
		System.out.println("월 ? ");
		m = sc.nextInt();
		
		// 서로 다른 자료형도 반환 가능
		var d = switch(m) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2-> y%4==0&&y%100!=0||y%400==0?29:28;
		default -> "입력 오류";
		}; // 스위치 표현식은 마지막에 ; 이 필요
		
		System.out.println(y+"년 "+m+"월의 마지막 일자는 "+d+"일");
	
		
		sc.close();
	
	
	}

}

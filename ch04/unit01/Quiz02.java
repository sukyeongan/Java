package ch04.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 년도를 입력 받아 윤년인지 평년인지 구하기
		Scanner sc = new Scanner(System.in);
		int y;
		String s;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
			s = "윤년";
		} else {
			s = "평년";
		}
		
		System.out.println(y +"년도는 " + s + "입니다.");
		
		sc.close();
	}

}

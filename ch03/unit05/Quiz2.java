package ch03.unit05;

import java.util.Scanner;

/*
  - 년도를 입력 받아 입력 받은 년도가 윤년인지 평년인지를 출력하기
    년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년이고
    그렇지 않으면 평년이다.
    윤년(2월 29일, 366), 평년(2월 28일, 365)
  - 실행 예
     년도 ? 2024
     2024년도는 윤년입니다.
 */

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		String s;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		s = y%4==0 && y%100 !=0 || y%400==0 ? "윤년" : "평년";
		
		System.out.printf("%d 년도 : %s\n", y, s);
		sc.close();
	}
}

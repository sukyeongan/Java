package ch02.unit02;

import java.util.Scanner;

public class Ex06_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name; // 문자열
		int age; // 정수
		char gender; // 문자
		double height; // 실수
		
		System.out.print("이름 ? ");
		name = sc.next(); // 문자열 입력
			// 공백은 구분 기호 이므로 공백 입력은 안된다.
		
		System.out.print("나이 ? ");
		age = sc.nextInt(); // 정수 입력
		
		System.out.print("성별[M/F] ? ");
		gender = sc.next().charAt(0); 
			// 문자 입력은 없으며, 문자열을 입력 받아 앞에 한문자만 가져오기
		
		System.out.print("키 ? ");
		height = sc.nextDouble(); // 실수 입력
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
		sc.close(); // 사용이 끝난 리소스를 close

	}

}

package ch03.unit05;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// 한문자를 입력 받아 입력 받은 문자가 소문자이면 대문자로 변환하고,
		//  대문자이면 소문자로 변환한다. 그리고 영문자가 아니면 입력 받은 
		//  문자를 그대로 출력 한다.
		//  'A' : 65, 'a' : 97
		
		Scanner sc = new Scanner(System.in);
		char a, b;
		
		System.out.print("한문자 ? ");
		a = sc.next().charAt(0);
		
		b = a >='a' && a <='z' ? (char)(a-32) : (a>='A'&&a<='Z'?(char)(a+32):a);
		
		System.out.printf("%c => %c\n", a, b);
		
		sc.close();

	}

}

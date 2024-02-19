package ch02.unit02;

import java.util.Scanner;

public class Ex07_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, tel;
		int age;
		
		System.out.print("이름 ? ");
		name = sc.nextLine(); // 엔터까지 입력 받아 엔터를 버림(공백입력가능)
		System.out.print("나이 ? ");
		age = sc.nextInt(); // 엔터전까지 입력 받음
		sc.nextLine(); // 엔터를 읽어서 버림
		System.out.print("전화번호 ? ");
		tel = sc.nextLine();
		
		System.out.println(name + ", " + age + ", " + tel);
		
		sc.close();
	}

}

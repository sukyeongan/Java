package ch02.unit02;

import java.util.Scanner;

public class EX07_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String name, tel;
		int age;
		
		System.out.print("이름 ? ");
		name = sc.nextLine(); //엔터까지 입력 받아 엔터를 버림(공백입력가능)
		System.out.print("나이 ? ");
		age = sc.nextInt(); // 엔터전까지 입력 받음 (여기는 정수만 가능)
		sc.nextLine(); //여기서 엔터를 버림 그래야 전화번호를 정상적으로 입력할 수 있음
		System.out.print("전화번호 ? ");
		tel = sc.nextLine ();
		
		System.out.println(name + "," + age + "," + tel);
		
		
		sc.close();

	}

}

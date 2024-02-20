package ch04.unit02;

import java.util.Scanner;

public class Ex01_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1~3 사이의 정수 ?");
		n = sc.nextInt();
		
		// switch : byte, short, char, int, String, enum만 가능
		switch(n) { // switch(수식 또는 변수)
		case 3: System.out.print("*");  // case 다음은 상수또는 리터널만가능
		case 2: System.out.print("*");
		case 1: System.out.print("*");
		}
		System.out.println();
		
		sc.close();
	}

}

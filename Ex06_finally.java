package ch09.unit03;

import java.util.Scanner;

public class Ex06_finally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ss = new String[3];
		int idx = 0;
		String s;

		try {
			idx = 0;
			System.out.println("문자열 입력[종료: 입력하지 않고 엔터]...");
			while((s=sc.nextLine()).length() !=0) {
				ss[idx++] = s;
				System.out.println("문자열 입력 :");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException : unchecked exception
			// : unchecked exception
			// : 배열 첨자를 벗어난 경우
			idx--;
			System.out.println("입력을 초과 했습니다.");
			
		} finally {
			System.out.println("예외 발생 여부와 상관 없이 실행...");
			sc.close();
		}
		
		System.out.println("\n입력 받은 문자열"); // 향상된 for문장 쓰면 null도 출력된다.
		for(int i=0 ; i<idx ; i++) {
			System.out.println(ss[i]);
		}
	}
}

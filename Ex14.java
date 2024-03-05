package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Test14 t = new Test14();
		
		t.input();
		t.input();
	}
}

class Test14 {
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		String name, tel;
		int k,e;
		
		try {
			System.out.print("이름 ? ");
			name = sc.next();
			
			System.out.print("국어 ? ");
			k = inputScore();
			
			System.out.print("영어 ? ");
			e = inputScore();
			
			System.out.print("전화번호 ? ");
			tel = sc.next();
			
			System.out.println(name+":"+k+":"+e+":"+tel);
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		
		System.out.println("------------------");
	}
	
	// 점수를 입력 받는 메소드
	private int inputScore() throws Exception {
		int n = 0;
		
		try {
			n = sc.nextInt();
			if(n < 0 || n > 100) {
				throw new Exception("점수는 0~100까지만 가능합니다.");
				
			}
		} catch (InputMismatchException e) {
			sc.nextLine(); // 잘못 입력 된것을 읽어서 버림
			
			// System.out.print("숫자만 입력 가능합니다.");
			//***
			throw new Exception("숫자만 입력 가능합니다.");
		}
		
		return n;
	
	}
	
}

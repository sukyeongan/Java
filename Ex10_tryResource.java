package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10_tryResource {

	public static void main(String[] args) {
		int n;
		String s;
	
		// try ~ with ~ resource : 자동으로 resource 를 close
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("나이 ? ");
			n = sc.nextInt();
			s = n >= 19 ? "성인" : "미성년자";
			
			System.out.println(s);
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능 합니다.");
		}
		
		System.out.println("end...");
	}

}

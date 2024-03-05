package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c ;

		try {
			System.out.println("두수 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a/b;
			System.out.printf("%d / %d = %d\n", a,b,c);
			
		}catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			// finally 블록은 리소스를 닫을 때 많이 사용한다.
			sc.close();
		}

	}

}

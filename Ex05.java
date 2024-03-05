package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 														
		int a, b, c;													
	
		try {
			System.out.println("첫번째 수 ? ");
			a = Integer.parseInt(br.readLine());
					
			System.out.print("두번째 수?");
			b = Integer.parseInt(br.readLine());
			
			c = a/b;
			
			System.out.printf("%d / %d = %d/n", a,b,c);
		
			// 예외를 상황별로 분리
		} catch (IOException e) { // checked 예외(반드시 catch 해야 함)
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
				// unchecked 예외
				// 문자열을 숫자로 변환하지 못하는 경우 등에서 발생
				// 반드시 catch 할 필요는 없지만 catch 하지 않은 경우
				// 	예외가 발생하면 프로그램은 비정상적인 종료가 됨
			
				System.out.println("숫자만 입력 가능합니다.");
				// System.out.println(e.getMessage()); // 간단한 메시지 출력
				// System.out.println(e.toString()); // 예외 종류 및 메세지 출력
				// e.printStackTrace(); // 자세히 출력
		} catch (ArithmeticException e) {
			// unchecked 예외
			// 숫자를 0으로 나누는 등 연산이 불가능한 경우
			System.out.println("0으로 나눌수 없습니다.");
		} catch (Exception e) {
			// Exception : 모든 예외를 catch 할 수 있다.
			// 여러 예외를  catch 할 경우 Exception은 다른 예외의
			// 	상위 클래스이므로 가장 마지막에 위치해야 함
			e.printStackTrace();
		}
		
		//NumberFormatException 영문자를 숫자로 못고칠때 발생하는 예외
		System.out.println("end...");
		
	}

}

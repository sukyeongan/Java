package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) {
		// 버퍼를 이용하여 문자(열)을 입력 받음. 입력 속도 향상
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //System.in을 통해 입력받을 수 있는 것은 1byte밖에 되지 않음.
		String s;														//InputStreamReader 한문자씩 입력받을 수 있으나 BufferedReader(new InputStreamReader(System.in)
		int a, b, c;													// 버퍼리더를 이용해서 문자열을 입력받을 수 있음.
	
		try {
			System.out.println("첫번째 수 ? ");
			s = br.readLine();
			a = Integer.parseInt(s);
					
			System.out.print("두번째 수?");
			b = Integer.parseInt(br.readLine());
			
			c = a/b;
			
			System.out.printf("%d / %d = %d/n", a,b,c);
			
		} catch (IOException e) {
			// IOEXeption : 입출력에 문제가 발생할때 발생하는 예외(checked exception)
			// : 입출력에 문제가 발생핼때 발생하는 예외(checked exception)
			// : checked exception은 메소드를 만들때 throws 한 예외
			// : checked exception은 예외처리를 하지 않으면 컴파일시 에러 발생
			e.printStackTrace(); // 에러 메시지를 표준 출력 장치로 보냄
		}	// 문자열 한줄의 입력을 받는 것.
		
		
		//
		System.out.println("end...");
		
	}

}

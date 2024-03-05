package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

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

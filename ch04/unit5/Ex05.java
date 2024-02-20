package ch04.unit5;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 0보다 큰 실수 5개를 입력 받아 합구하기
		// 단, 입력 받은 수가 0이하 이면 다시 입력 받는다.
		
		Scanner sc = new Scanner(System.in);
		double s = 0,n;
		
		/*
		for(int i=1; i<=5;i++) { 
			System.out.print("실수 ? ");
			n = sc.nextDouble(); //-3을 입력했을 때 i는 1증가하여 하나 입력받은 것이 돼버리므로
			if( n <= 0 ) {
				i--; //여기서 i--를 해준다.
				continue;
			}
			
			s+=n;
			
		}
		System.out.println("결과 : " + s);
		*/
		
		
		for(int i=1; i<=5;) { 
			System.out.print("실수 ? ");
			n = sc.nextDouble(); 
			if( n <= 0 ) {
				
				continue;
			}
			
			s+=n;
			i++; // 양수일 때만 증가됨 아니면 i++조건을 이곳에 준다. 위에서는 ;(공란 처리)
		}
		System.out.println("결과 : " + s);
		
		sc.close();
		
	}

}

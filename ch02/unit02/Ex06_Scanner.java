package ch02.unit02;

import java.util.Scanner;

public class Ex06_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String name; // 문자열
		int age; //정수
		char gender; // 믄자
		double height; //실수
		
		System.out.print("이름 ? ");
		name = sc.next();  //문자열 입력
			// 공백은 구분 기호 이므로 공백 입력은 안된다.
			// next는 공백전이나, enter전까지만 입력을 받는다.
		
		System.out.print("나이 ? ");
		age = sc.nextInt(); // 정수입력
							// 정수를 입력하지 않으면 프로그램 터짐
		
		System.out.print("성별[M/F] ? ");
		gender = sc.next().charAt(0);
			// 문자 입력은 없으며, 문자열을 입력 받아 앞에 한문자만 가져오기
		
	
		System.out.print("키 ? ");
		height = sc.nextDouble(); //실수 입력
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);

	// 입출력 장치를 리소스라고 한다. 사용이 끝나면 닫아줘야 정상상태를 만들어준다. 그래서 리소스를 close해줘야 한다.
		
		sc.close();
		//리소스;입력장치를 사용해줬으므로 사용이 끝난 리소스를 close
	
	}

}

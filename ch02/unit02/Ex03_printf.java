package ch02.unit02;

public class Ex03_printf {

	public static void main(String[] args) {
		/*
		 - System.out.printf("출력서식", 출력값,출력값)
		 : 출력 서식에 따라 값을 출력
		 : 출력 후 라인을 넘기지 않는다.
		 :  System.out.format("출력서식", 출력값,출력값) 와 동일
		 */
		
		int a, b, c; // 정수를 저장할수 있는 변수
		a = 13; // a 변수에 13을 대입
		b = 4;
		
		c = a + b; // a + b의 값을 c에 대입
		
		// System.out.println(c);
		// System.out.println(a + "+" + b + "=" + c);
		
		// System.out.printf("%d + %d = %d\n", a, b, c);
		System.out.printf("%d + %d = %d%n", a, b, c);
		System.out.format("%d + %d = %d%n", a, b, c);
			// % : 형식 지정 제어문자의 시작
			// %d : 정수 출력
		System.out.println();
		
		System.out.printf("%d + %d = %d\t", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
			// \n, %n : 라인 넘김
		System.out.printf("%d * %d = %d\t", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		
		// System.out.printf("%d % %d = %d\n", a, b, a%b); // 런타임 오류(실행시 오류 발생)
			// % 연산자 : 나머지
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
			// %% 변환 문자 : % 자체를 출력
	}

}

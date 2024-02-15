package ch02.unit02;

public class Ex03_printf {

	public static void main(String[] args) {
		
		/*
		 - System.out.printf("출력서식", 출력값, 출력값)
		 : 출력 서식에 따라 갑슬 출력
		 : 출력후 라인을 넘기지 않는다.
		 : System.out.format("출력서식",출력값,출력값) 와 동일
		 */
		
		int a, b, c; //정수를 저장할 수 있는 변수
		a = 13; //a 변수에 13을 대입
		b = 4 ;
		
		c = a + b ; // a + b의 값을 c에 대입
		
		
		System.out.println(a + " + " + b + " = " + c);
		System.out.printf("%d + %d = %d\n", a,b,c);
		System.out.format("%d + %d = %d\n", a,b,c);
		//%d : 10진수로 출력한다는 뜻
		// % : 형식 지정 제어문자의 시작

		System.out.println();
		
		System.out.printf("%d + %d = %d\t", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		
		// \n, %n 라인넘김
		System.out.printf("%d * %d = %d\t", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
			// % 연산자 : 나머지 35번 줄에서 %하나만 쓰면 오류나고 %% 두개 써야한다.
			
		//printf("%d % %d = %d\n", a, b, a%b); // 런타임 오류(실행시 오류 발생)
		
	
	}

}

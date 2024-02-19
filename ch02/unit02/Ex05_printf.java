package ch02.unit02;

public class Ex05_printf {
	public static void main(String[] args) {
		// %f : 실수 출력
		System.out.printf("%f\n", 123.156); // 123.156000
		System.out.printf("%8.2f\n", 123.156); // 123.16  소수점 이하 자리수가 부족하면 반올림
		System.out.printf("%.2f\n", 123.156); // 123.16
		System.out.printf("%3.2f\n", 123.156); // 123.16 정수자리수가 부족하면 정수는 모두 출력
		System.out.printf("%5.0f\n", 123.3); // 123
		System.out.printf("%5.0f\n", 123.7); // 124
		System.out.println();
		
		System.out.printf("%e", 12345.0e-03); // 1.234500e+01
			// e변환 : n.nnnnnne+nn
		    // 12345.0 * 10의 -3 => 12.345 => 1.2345 * 10의 1승
		System.out.printf("%10.3e\n", 123.456);
			// 1.23456 * 10의 2승 => 1.234560e+02
		    // => 1.235e+02
		System.out.println();
		
		// 2진수 : 0, 1
		// 10진수 : 0~9
		// 8진수(2진수 3자리 : 8진수 1자리) : 0~7
		// 16진수(2진수 4자리 : 16진수 1자리) : 0~9,A,B,C,D,E,F
		int a = 013; // 8진수
		int b = 0xC0; // 16진수
		int c = 34567;
		System.out.printf("%d %d %d\n", a, b, c); // 11 192
		System.out.printf("%o %o %o\n", a, b, c); // 8진수
		System.out.printf("%x %x %x\n", a, b, c); // 16진수
		System.out.printf("%X %X %X\n", a, b, c); // 16진수
		
		System.out.printf("%#o %#o %#o\n", a, b, c); // 8진수
		System.out.printf("%#X %#X %#X\n", a, b, c); // 16진수
			// # : 8진수는 0, 16진수는 0x가 숫자 앞에 출력
		System.out.println();
		
		String s = "Seoul Korea"; // 문자열
		System.out.printf("%s\n", s); // Seoul Korea
		System.out.printf("%S\n", s); // SEOUL KOREA
		System.out.printf("%.5s\n", s); // Seoul
		System.out.println();
		
		char c1 = 'a', c2 = 'b';
		System.out.printf("%c %c %c %c %c %c\n", c1,c2,c1,c1,c2,c1);
			// a b a a b a
		System.out.printf("%1$c %2$c %1$c %1$c %2$c %1$c\n", c1,c2);
		
	}
}

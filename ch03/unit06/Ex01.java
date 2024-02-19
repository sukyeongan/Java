package ch03.unit06;

public class Ex01 {

	public static void main(String[] args) {
		// 형변환
		short a;
		byte b;
		char c;
		int d;
		long e;
		
		a = 10;
		// b = a; // short > byte 이므로 컴파일 오류
		
		b = (byte)a; // 강제로 형변환
		System.out.println(b);
		
		a = 200;
		b = (byte)a; // overflow. 잘림 현상
		System.out.println(b);
		
		c = 'A';
		d = c + 10; // 자동 형변환
		System.out.println(d);
		
		d = 100000;
		e = d * d; // int * int => int => long, overflow 발생
		System.out.println(e); // 1410065408
		
		e = (long)d * d; // 강제 형변환
		System.out.println(e); // 10000000000

	}

}

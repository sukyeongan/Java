package ch03.unit01;

public class Ex02 {

	public static void main(String[] args) {
		byte b1, b2, b3;
		b1 = 10;
		b2 = 5;
		
		// b3 = b1 + b2; // 컴오류. 피연자가 byte이면 int 로 변환하여 연산
				// byte형 + byte형 => int형 + int형 => int형
		b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		// b1 = 200; // 컴오류
		b1 = 100;
		b2 = 120;
		b3 = (byte)(b1 + b2);
		System.out.println(b3); // overflow. -36
		
		short s1 = 20, s2 = 30, s3;
		// s3 = s1 + s2; // 컴오류
		s3 = (short)(s1 + s2); // 형변환
		System.out.println(s3);
		
		char ch = 'A';
		// ch = ch + 10; // 컴오류
		ch = (char)(ch + 10);
		System.out.println(ch);
		
		int a = 'A';
		a = a + 10;
		System.out.println(a); // 75
		
	}

}

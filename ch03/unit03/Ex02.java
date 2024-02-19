package ch03.unit03;

public class Ex02 {

	public static void main(String[] args) {
		// bit 단위 shift 연산자
		
		int a, b;
		
		a = 128;
		System.out.println("a:" + a);
		
		b = a << 3; // 좌측으로 3비트 이동. a * (2의3승)과 동일
		System.out.println("a<<3 : " + b); // 1024
		
		b = a >> 3; // 우측으로 3비트 이동. a / (2의3승)과 동일
		System.out.println("a>>3 : " + b); // 16
		
		a = -128;
		System.out.println("\na:" + a);
		
		b = a << 3;
		System.out.println("a<<3 : " + b); // -1024
		
		b = a >> 3; // 우측으로 이동하고 빈자리는 부호로 채움
		System.out.println("a>>3 : " + b); // -16
		
		b = a >>> 3; // 논리적 우측 shift
		// 우측으로 이동하고 빈자리는 0으로 채움
		System.out.println("a>>>3 : " + b);
	}

}

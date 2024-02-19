package ch03.unit04;

public class Ex01 {

	public static void main(String[] args) {
		// 배정연산자
		short a, b;
		
		a = 10; b = 5;
		a = (short)(a + b); // 형변환 해야 함
		System.out.println(a);
		
		a = 10; b = 5;
		a += b; // 형변환이 일어나지 않으며 위보다 연산 속도 빠름
		System.out.println(a);
		
		char c = 'A';
		c += 10;
		System.out.println(c); // K
		
		float f = 3.5f;
		c = 'A';
		c += f;
		System.out.println(c); // D
		
		int n = 4;
		n *= 0.6;
		System.out.println(n); // 2
	}

}

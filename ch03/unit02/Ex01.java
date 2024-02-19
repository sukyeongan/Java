package ch03.unit02;

public class Ex01 {

	public static void main(String[] args) {
		// 관계 연산자 : 연산 결과는 true 또는 false
		int a = 10, b = 5;
		boolean c;
		
		System.out.println(a + ", " + b);
		
		c = a > b;
		System.out.println("a > b : " + c);
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));

	}

}

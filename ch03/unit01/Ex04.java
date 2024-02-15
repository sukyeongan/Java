package ch03.unit01;

public class Ex04 {

	public static void main(String[] args) {
		int a, b;
		double c;
		
		a = 3;
		b = 2;
		
		c = a/b +a/b;
		System.out.println(c); // 2.0
		
		c = (double)(a/b) +a/b;
		System.out.println(c); // 2.0
		
		c = (double)a/b +a/b;
		System.out.println(c); // 2.5
		
		c = 3.7 % 1.3;
		System.out.println(c); // 1.1
		
		c = 'A' + 10;
		System.out.println(c); // 75.0
		

	}

}

package ch03.unit01;

public class Ex06 {

	public static void main(String[] args) {
		int a;
		double b;
		
		// 1의 자리 버림
		a = 123456;
		a = a / 10 * 10;
		System.out.println(a);
		
		// 1의 자리 반올림
		a = 123456;
		a = (a + 5)/10 * 10;
		System.out.println(a); // 1234560
		
		b = 126.4563;
		//소수점 3째자리에서 반올림해서 소수저 2자리만 출력
		System.out.printf("%.2f\n", b);
		
		//소수점 3째자리에서 버리고 소수저 2자리만 출력
		b = 126.4563;
		b = (int)(b*100) / 100.0;
		System.out.println(b); //여기 있는건  printf로 못함

	}

}

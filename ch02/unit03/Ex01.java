package ch02.unit03;

public class Ex01 {

	public static void main(String[] args) {
		byte b1;
		byte b2 = 10; // 선언과 동시에 초기화
		// byte b3 = 130; // 컴파일 오류
		// System.out.println(b1); // 컴파일오류. 초기화하지 않으면 연산에 사용되거나 출력이 불가능
		System.out.println(b2); // 10
		
		b1 = 5;
		System.out.println(b1);
		
		b2 = 30; // 실행중 값 변경. 이전값은 기억 불가
		System.out.println(b2); // 30
		
		// b1 = 150; // 컴파일오류
		b1 = (byte)150;
		System.out.println(b1); // -106
		
		short s1, s2 = 100;
		s1 = 'A';
		System.out.println(s1 + ", " + s2);
		
		int i1 = 200;
		int i2 = 'a'; // 97
		int i3;
		i3 = '0' + '1'; // 48 + 49
		System.out.println(i1 + "," + i2 + "," + i3);
		
		// b1 = i2; // 컴파일오류. 큰자료형은 적은자료형에 대입 불가
		b1 = (byte)i2; // 큰자료형을 작은자료형으로 형변환
		System.out.println(b1); // 97
		
		long l1, l2;
		l1 = 100; // int를 long에 대입. 적은자료형을 큰자료형에 대입가능
		// l2 = 2200000000; // 22억은 int 범위를 벗어나므로 컴파일오류
		l2 = 2200000000L;
		System.out.println(l1 + "," + l2);
	}
}

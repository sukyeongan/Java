package ch02.unit03;

public class Ex05 {

	public static void main(String[] args) {
		// char : 2byte, 부호없는 정수
		
		char c1 = 'A', c2, c3;
		c2 = '\u0041'; // 유니코드(16진수)
		c3 = '\101'; // 8진수
		System.out.println(c1 + ", " + c2 + ", " + c3);
				// A A A
		
		// c1 = ''; // 오류. 빈문자는 없음
		// c1 = "A"; // 오류. 문자열은 char에 대입 불가
		// c1 = 'AB'; // 오류. 문자는 한글자로 구성
		
		c1 = '대';
		System.out.println(c1);
		
		int n = c1;
		System.out.println(n); // 45824. 한글 '대'의 유니코드값
		
		n = '한';
		System.out.println(n); // 54620
		
		c1 = 54620;
		System.out.println(c1); // 한
		
		n = 0;
		System.out.println(n); // 0
		
		n = '0';
		System.out.println(n); // 48
		
		double k = 'K';
		System.out.println(k); // 75.0

		
	}

}

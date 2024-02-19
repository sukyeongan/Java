package ch03.unit01;

public class Ex10 {

	public static void main(String[] args) {
		char c;
		
		c = 'A';
		// c = c + 1; // 컴파일오류
		// c = (char)(c + 1);
		c++; // ++, -- 는 형변환이 일어나지 않는다.
		
		System.out.println(c); // B
		
		c = 'A';
		System.out.println((c++) + ", " + (++c)); // A, C

	}

}

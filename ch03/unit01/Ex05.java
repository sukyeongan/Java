package ch03.unit01;

public class Ex05 {

	public static void main(String[] args) {
		char ch;
		
		ch = '0' + '1'; // 리터널 연산자 리터널 => 형변환이 일어나지 않음
			// 48 + 49 = 97
		System.out.println(ch); // a
		
		/*
		ch = 'A';
		ch = ch + 1; // 컴파일 오류
		*/
		
		ch = 'A' + 10;
		System.out.println(ch); // K

	}

}

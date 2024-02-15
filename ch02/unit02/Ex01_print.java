package ch02.unit02;

public class Ex01_print {
	public static void main(String[] args) {
		//System.out.print(); //컴파일오류. print()는 인수를 생략할 수 없다.
		
		/*
		 System.out.print(인수)
		 :인수의 내용을 출력
		 :인수의 내용을 출력하고 라인을 넘기지 않는다.
		 */
		
		System.out.print("서울");
		System.out.print("부산");
		System.out.print("대구");
		System.out.print("\n"); //라인 넘김
		System.out.print("JAVA\nSpring\n");
		System.out.print("HTML\n\n");
		
		System.out.print("국어\t영어\t수학\n"); // \t : 탭키
		System.out.print(80 + "\t");
		System.out.print(80 + "\t");
		System.out.print(80 + "\n");
	}
}


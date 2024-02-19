package ch02.unit02;

public class Ex02_println {

	public static void main(String[] args) {
		/*
		 - System.out.println([인수])
		   : 인수의 내용을 출력 후 라인을 넘긴다.
		   : 인수는 생략 가능하며, 없으면 라인만 넘긴다.
		 */
		
		System.out.println("HTML 5");
		System.out.println("CSS 3");
		System.out.println(); // 라인을 넘김. System.out.print("\n") 와 동일
		
		System.out.println("JAVA\n");
		System.out.println("ORACLE");
		System.out.println();
		
		System.out.println("국어\t영어\t수학");
		System.out.println(90 + "\t" + 80 + "\t" + 90);
	}

}

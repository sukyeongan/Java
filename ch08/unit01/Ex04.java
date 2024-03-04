package ch08.unit01;

public class Ex04 {
	public static void main(String[] args) {
		Demo4 obj = new Demo4(); // Demo4라는 객체를 생성 1.
		obj.print();
		obj.disp();
	}
}

/*
 - 하위 클래스의 클래스를 생성하는 경우
 	1) 상위 클래스의 필드 메모리 할당, 기본값 초기화, 초기화 수식 실행
 	2) 하위 클래스의 필드 메모리 할당, 기본값 초기화, 초기화 수식 실행
 	3) 상위 클래스 초기화 블록 실행
 	4) 상위 클래스의 생성자 몸체 실행
 	5) 하위 클래스 초기화 블록 실행
 	6) 하위 클래스 생성자 몸체 실행 
 */

class Test4 { //얘가 먼저0으로  초기화가 되고 다시 10으로 초기화가 됨 2.
	int a = 10;
	public Test4() {
		System.out.println("Test4 생성자...");
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Demo4 extends Test4{
	int x = 100;
	
	public Demo4() {   //얘가 0으로 초기화 된 뒤 100으로 초기화 됨 3.
		
		super(); // 상위 클래스 생성자 몸체 호출. 최 상단에서 한번만 가능
				// 없으면 컴파일러에 의한 super(); 가 추가되어 상위 클래스 생성자 몸체 실행
				//this 열고닫고가 있으면 super 못부름
		
		System.out.println("Demo4 생성자...");
	}
	
	public void disp() {
		System.out.println(a+","+x);
		
	}
}
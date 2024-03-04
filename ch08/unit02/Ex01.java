package ch08.unit02;

public class Ex01 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		obj.disp();
		System.out.println();
		
		obj.write();
	}
}

class Test1 {
	int a = 10;
	
	public void disp() {
		System.out.println("a:" + a);
	}
}

class Demo1 extends Test1 {
	int x = 100;
	
	public void write() {
		super.disp();
	}
	
	/*
	//컴파일 오류 : 재정의되는 메소드의 접근 제어자는 크거나 같아야 한다.
	protected void disp() {
		System.out.println("a:" + a + ","+x);
	}
	*/
	
	//-메소드 override
	// : 메소드의 시그너처가 동일해야 한다. 
	// :	상속 관계가 있어야 한다.
	// : 오버라이딩하면 상위 클래스의 메소드는 숨는다.
	// : @Override - 메소드 오버라이드 규칙이 맞는지 검증
	
	
	public void disp() {
		System.out.println("a:"+a+","+x);
	}
}

package ch08.unit03;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test3 t2 = new Sample3();  // 진짜는 Sample(자식 객체)
		Test3 t3 = new Demo3(); // 업캐스팅해놓은 것. // 오버라이드 안되어있어서 아무 문제 없음
		
		t1.disp(); // Test3으로 print()...
		t2.disp(); // Sample3의 print()...
		t3.disp(); // Test3으로 print()...
	}
}


class Test3 {
	public void print() {
		System.out.println("Test3으로 print()...");
	}

	public void disp() {
		print();
	}
}

class Sample3 extends Test3 {
	// 재정의
	public void print() {
		System.out.println("Sample3의 print()...");
	}

	public void write() {
		System.out.println("write()...");
	}
}

class Demo3 extends Test3 {
	public void sub() {
		System.out.println("sub()...");
	}
}

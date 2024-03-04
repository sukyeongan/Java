package ch08.unit04;

public class Ex01 {
	public static void main(String[] args) {
		//Test1 t = new Test1(); // 컴오류. 추상클래스는 객체 생성 불가
		
		Test1 t = new Demo1();
		t.disp();
	}
}

// 추상클래스
abstract class Test1 {
	// 추상 메소드. // 추상 메소드가 없어도 추상 클래스를 만들 수 있다.
	public abstract void disp(); // 이 줄 지워도 추상클래스는 만들 수 있다. 
	
	public void sub() {
		System.out.println("sub...");
	}
}

class Demo1 extends Test1{

	@Override
	public void disp() {
		System.out.println("disp...");
	}
}
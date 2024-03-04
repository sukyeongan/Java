package ch08.unit03;

public class Ex01 {
	public static void main(String[] args) {
		// 클래스의 참조형 변수의 형변환은 상속 관계에서만 가능하다
		/*
		int a = 10; // 이건 가능
		long b = a; // 이건 가능
		*/ 
		
		/*
		 Integer a = 10;
		 // Long b = a; //컴오류. 상속관계가 아님
		 Long b = (Long)a; //컴오류. 상속관계가 아님
		 */
		
		Test1 t = new Test1();
		t.print();
		//System.out.println(t.c); //데모에 c가 있다고 자식거를 가져다 쓸 수 없다.
		// 상위클래스객체는 하위클래스 멤버에 접근 불가
		System.out.println();
		
		// 클래스는 상속관계가 아니면 어떠한 경우에도 형변환이 안된다.
		// Test1(상위)>Demo1(하위)
		/*
		 -up casting
		 : 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		 : up casting는 언제나 가능
		 : 형변환을 하지 않아도 된다.
		 */
		
		Demo1 d = new Demo1(); // 메모리할당 -> 컴파일할 때가 아니라 아니라 실행할때 할당
		Test1 tt = d; // 업 캐스팅  //진짜 tt는 demo
		System.out.println(d==tt); // new를 한번했으므로 true가 나온다.
		
		System.out.println(tt.b); // 20
				// 업캐스팅 되었어도 필드는 자기 자신것을 나타낸다.
		System.out.println(d.b); // 100
		//System.out.println(tt.c); // 컴오류. Test1에 c라는 필드가 없음
		
		//tt.write(); Test라는 클래스 안에 write()가 없으므로 컴오류나온다.
		// 업캐스팅 객체에서 재정의된 메소드는 숨어버리기 때문에 하위클래스의 메소드가 호출된다.
		// 이곳에서 Test1 클래스의 print()를 호출할 방법은 없다.
		tt.print();
	}
}

class Test1 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
	
	public void disp() {
		System.out.println("disp()...");
	}
}

class Demo1 extends Test1 {
	int b = 100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println("a:" + a+",b:" + b+",super.b:" + super.b+",c"+c);
	}
	
	public void write() {
		print();
		super.print();
		disp();
	}
}

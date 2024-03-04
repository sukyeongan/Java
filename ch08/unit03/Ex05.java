package ch08.unit03;

public class Ex05 {
	public static void main(String[] args) {
		Test5 t1 = new Test5(); //Test 객체
		Demo5 d1 = new Demo5();
		
		System.out.println(t1.b+":"+d1.b); // 20:100
		t1.print();
		d1.print();
		System.out.println();
		
		// Object > Test5> Demo5
		// up casting
		Test5 t2 = new Demo5(); // Demo 객체
		Test5 t3 = d1;
		Object o = new Demo5(); // 15~17은 다시 Demo로 되돌릴 수 있음(=down casting가능하다는 뜻)
		
		System.out.println(t2.b); // 20 필드는 자기것. 없으면 상위 것
		//System.out.println(t3.c); //Test5 class에는 c라는필드가  없으므로 오류 발생
		System.out.println(((Demo5)t3).c); // 다운캐스팅
		System.out.println(((Demo5)o).c); // 다운캐스팅
		
		t2.print(); // 메소드는 오버라이딩 된 경우 하위 클래스 메소드(상위 메소드는 숨는다)
		//t2.write(); // 컴파일 오류.  Test5에 없는 메소드는 호출 불가
		((Demo5)t2).write(); // 다운캐스팅
		
		// down casting
		//Demo5 dd = (Demo5)t1; // 런타임오류
		// 다운 캐스팅은 업 캐스팅 한 것만 가능하다
		
		System.out.println(t1);  //ch08.unit03.Test5@7f690630
		System.out.println(t2);	// ch08.unit03.Demo5@edf4efb
		if(t1 instanceof Demo5) {
			Demo5 dd = (Demo5)t1;  // t1대신 t2를 주면 Demo5객체의 주소값이 나옴.
			System.out.println(dd);
		}else {
			System.out.println("Demo5 객체가 아님...");
		}
		
		System.out.println(t1 instanceof Demo5); // false
		System.out.println(t1 instanceof Test5); // true
		System.out.println(t1 instanceof Object); // true
		System.out.println();
		
		//Demo5 d2 = t2; //컴파일오류. 다운캐스팅은 반드시 강제 캐스팅
		Demo5 d2 = (Demo5)t2;
		System.out.println(d2.c);
		
		Test5 t4 = (Test5)o; //o의 자료형은 Object 진짜는 demo // 안터진다. // 다운캐스팅 한거라서.
		System.out.println(t4.b); // 20
		Demo5 t5 = (Demo5)o;
		System.out.println(t5.b); // 100
		
	}
}

class Test5 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
	public void disp() {
		System.out.println("disp()...");
	}
}

class Demo5 extends Test5 {
	int b = 100;
	int c = 200;
	
	// 재정의
	public void print() {
		System.out.println(a+","+super.b+","+b+","+c);
	}
	
	public void write() {
		
		System.out.println("write()...");
	}
}
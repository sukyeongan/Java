package ch08.unit03;

public class Ex02 {
	public static void main(String[] args) {
		
		/*
		 - up casting
		 	: 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		 	: 언제나 가능
		 	: 형변환을 하지 않아도 된다.
		 	
		 - down casting
		 : up casting 한 객체를 다시 원래 객체로 캐스팅하는 것
		 : down casting는 up casting한 객체만 가능
		 : down casting은 반드시 강제 캐스팅 해야 한다.
		 */
		
		//Test2 t = new Demo2(); // 업 캐스팅 Demo의 아버지인 Test2를 참조
		
		// Object t = new Demo2(); // 업 캐스팅
		Test2 t = new Demo2(); // 업 캐스팅
		// t.write() ; // Test2라는 클래스 안에 write()가 있다 없다만 보는 것. => 컴오류
		// Demo안에 write가 있으므로 얘를 부르려면 down casting 해야 한다.
		
		// 다운 캐스팅
		Demo2 d = (Demo2)t;
		d.write();
		
		/*
		다운 캐스팅
		(Demo2)t.write(); 가운데 .과 ()중에 .의 우선순위가 더 높다. 그래서 (Demo2)t를 다운캐스팅 하기 위해서는
		((Demo2)t).write();로 표시한다.
		
		*/
		// 다운 캐스팅
		((Demo2)t).write();
		
		
	}
}

class Test2 {
	
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
	
	public void disp() {
		System.out.println("disp()...");
	}
}

class Demo2 extends Test2 {
	int b = 100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println("a:"+a+",b:"+b+",super.b:"+super.b+",c:"+c);
		
	}
	public void write() {
		System.out.println("write()...");
	}
}
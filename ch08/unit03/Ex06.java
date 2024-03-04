package ch08.unit03;

public class Ex06 {
	public static void main(String[] args) {
		Object o = new Test6();
		
		/*
		if(o instanceof Test6) { // Object의 객체가 Test6의 객체가 맞는지? 확인하는 코드
			Test6 t = (Test6)o;
			t.print();
 		}
 		*/
		
		// JDK 16
		// instanceof 연산자의 패턴 매칭
		if(o instanceof Test6 t) {
			t.print();
		}
	}
}


class Test6 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+","+b);
	}
}

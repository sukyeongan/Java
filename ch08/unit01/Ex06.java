package ch08.unit01;

public class Ex06 {
	public static void main(String[] args) {
		
		Demo6 obj = new Demo6(5);
		obj.disp();
		 // 생성자를 안만드면 default생성자가 만들어지고 그러면 super()가 자동으로 컴파일 된다.
	}
}

class Test6 {
	int x;
	
	public Test6() {
		x = 0;
		System.out.println("Test5-인자없는 생성자");
	}
	
	public Test6(int x) {
		this.x = x;
		System.out.println("Test5-인자하나 생성자");
	}
	
	public void print() {
		System.out.println(x);
	}
}

class Demo6 extends Test6{
	int a;
	
	public Demo6() {
		// super(); 이 생략된것임
		a = 0;
		System.out.println("하위클래스-인자없는 생성자");
	}
	
	public Demo6(int a) {
		this(a,10);
		//super() . this윗줄에 있어야함 근데 this도 마찬가지로 윗줄에 있어야 함(최상단) super,this 둘다 최상단에 위치해야 하므로 둘중 하나만 가능
		// this([인수]); 가 있으면 super([인수]);는 올 수 없음
		System.out.println("하위클래스-인자 하나 생성자");
	}
	
	public Demo6(int a, int x) { // 결국 생성자 몸체가 3번 실행됨
		super(x); // super()부른 거임
		this.a = a;
		System.out.println("하위클래스-인자 둘 생성자");
	}
	
	public void disp() {
		System.out.println(x+","+a);
	}
}

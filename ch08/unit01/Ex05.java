package ch08.unit01;

public class Ex05 {
	public static void main(String[] args) {
		// Test5 t = new Test5(); //컴오류. 인자가 있는 생성자만 존재하므로
		//Test5 t = new TEst5(10)
		
		Demo5 obj = new Demo5();
		obj.disp();
		

	}
}

class Test5 {
	int x;
	public Test5(int x){ // 생성자
		this.x = x; 
	}
	public void print() {
		System.out.println(x);
	}
}

// 이제 상속을 받는 클래스를 만든다.
/*
- 상위 클래스에 인자가 있는 생성자만 존재하는 경우
  하위 클래스는 반드시 생정자를 만들어야 하고
  명시적으로 super(인자)로 상위 클래스의 생성자를 호출해야 함.
 */

class Demo5 extends Test5{  
	int a = 10;
	
	public Demo5() { // 내가 생성자를 안만드면 컴파일러가 생성자를 만들어 준다.
		super(10);  // 인자가 없는 생성자가 없으므로 명시적으로 생성자를 호출해주어야 한다.
	}
	
	public void disp() {
		System.out.println(x+","+a);
	}
}




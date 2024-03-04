package ch08.unit01;

public class Ex03 {

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		obj.disp();
		obj.print(); // 10:20 // 아버지꺼 불렀으니까 아버지에 있는 10,20이 나온다.
	}
}

class Test3 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(this.a + ":" +this.b); //this생략가능
		// System.out.println(a+":"+b)
	}
}

class Demo3 extends Test3 {
	int b = 100;
	int x = 200;
	int y = 300;
	
	public void disp() {
		int x = 50;
		
		System.out.println("a:"+ a); // 10, super 클래스의 a
		System.out.println("this.a:" + this.a); //this : 객체를 갖다가 자기 자신을 가져오는것 // 어짜피 this가 생략된것이니 상관x
		System.out.println("super.a" + super.a); //this : 객체를 갖다가 자기 자신을 가져오는것 // 어짜피 this가 생략된것이니 상관x
		System.out.println("b:"+ b); // 100 , 이름이 똑같으면 자신필드의 우선순위가 더 높다.
		System.out.println("super.b"+ super.b); //20 아버지꺼 부르려면 이렇게 super쓰면 됨
		System.out.println("x: " + x ); // 50, 지역변수 //지역변수의 우선순위가 필드보다 높다!
		System.out.println("this.x: " + this.x ); // 50, 지역변수 // 필드의 x를 부르려면 this를 앞에 붙이면 된다.
		System.out.println("y:" + y); // 300, 자신클래스의 필드 y
						// this.y와 동일한 결과
	}
	
}

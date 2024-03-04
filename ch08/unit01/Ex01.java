package ch08.unit01;

public class Ex01 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		System.out.println(obj.c); // 상위 클래스 필드 접근
		obj.write(); // 상위 클래스의 메소드 접근
		
		obj.disp();
	}
}

class Test1{
	private int a = 10;
	int b = 20; //default
	protected int c = 30;
	public int d = 40;
	
	public void write() {
		System.out.println(a+":"+b+":"+c+":"+d);
	}
}

class Demo1 extends Test1{
	int x = 100;
	
	public void disp() {
		//System.out.println(a); //컴오류. 상위클래스의 private 멤버는 하위클래스에서 접근 불가
		System.out.println("상위에서물려받은필드 : " +b+","+c+","+d);
		System.out.println("x:"+x);
	}
	
	public void sub() {
		write(); //상위 클래스 메소드 호출
	}
}

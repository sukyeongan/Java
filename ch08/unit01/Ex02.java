package ch08.unit01;

import ch08.Sample;

public class Ex02 { //얘는 자식이 아님
	public static void main(String[] args) {
		Test2 t = new Test2();
		//System.out.println(t.c); // 패키지가 다르면 protected는 sub(하위) 클래스에서만 접근 가능
		System.out.println(t.d); //그래서 protected보다는 default가 크다고 할 수 있는 것.

	}

}

class Test2 extends Sample { //얘는 자식
	public void disp() {
			// System.out.println(a); // private는 접근 불가
			// system.out.println(b); // default 접근 제어는 동일한 패키지에서만 가능
			System.out.println(c+":"+d);
	}
}
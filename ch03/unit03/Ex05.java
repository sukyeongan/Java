package ch03.unit03;

public class Ex05 {

	public static void main(String[] args) {
		int a = 123;
		int key = 7788;
		
		System.out.println("a:" + a);
		
		a = a ^ key; // 암호화의 기본 연산에 사용
		System.out.println("암호화 : " + a);
		
		a = a ^ key;
		System.out.println("복호화 : " + a);
	}
}

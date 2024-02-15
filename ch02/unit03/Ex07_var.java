package ch02.unit03;

public class Ex07_var {

	public static void main(String[] args) {
		// var a ; // 컴파일 오류. 초기화 필요

		var a = 10;
		int n = a;
		System.out.println(n);

		var s = "seoul";
		System.out.println(s instanceof String); // 타입을 확인
		System.out.println(s);
	}

}
//ctrl + shift + f : 정렬
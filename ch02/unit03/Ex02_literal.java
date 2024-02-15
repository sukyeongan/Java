package ch02.unit03;

public class Ex02_literal {
	public static void main(String[] args) {
		int a = 0b110; // 숫자 앞 0b : 2진수
		// a = 0b201; //컴오류
		int b = 0123; //8진수
		int c = 123; //10진수
		int d = 0x123; //16진수
		int e = 0xA1F;
		int f = 1_1_0;
		
		System.out.println(a+","+b+","+c+","+d+","+e+","+f);
	}
}

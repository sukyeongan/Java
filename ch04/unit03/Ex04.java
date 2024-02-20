package ch04.unit03;

public class Ex04 {

	public static void main(String[] args) {
		// 1~100 까지 합
		
		/*
		int n ,s;
		n = 0;
		s = 0;
		while(n<100) {
			n++;
			s +=n;
		}
		System.out.println("결과 : " + s); //5050
		
		*/
		
		
		int n ,s;
		n = 0;
		s = 0;
		while(++n<=100) {
			s +=n;
		}
		System.out.println("결과 : " + s); //5050
		
		/*
		int n ,s;
		n = 0;
		s = 0;
		while(n++<100) {
			s +=n;
		}
		System.out.println("결과 : " + s); //5050
		
		*/
	}

}

package ch04.unit03;

public class Ex05 {

	public static void main(String[] args) {
		// 1~100 까지 짝수합
		
		int n ,s;
		n = 0;
		s = 0;
		while(n<100) {
			n +=2;
			s +=n;
		}
		System.out.println("결과 : " + s);
		

	}

}

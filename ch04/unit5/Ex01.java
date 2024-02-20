package ch04.unit5;

public class Ex01 {
	public static void main(String[] args) {
		//1~100 사이의 수중 2 또는 3의 배수를 제외한 수의 합 구하기
		
		// contine : while, do~while, for문에서만 사용
		/*
		int n, s;
		s = n = 0;
		while(n < 100) {
			n++;
			if(n%2==0||n%3==0) {
				continue;
			}
			s += n;
		}
		System.out.println("결과 : " + s);
		
		*/
		
		int s = 0;
		for(int n =1; n <=100 ; n+=2) {
			s += n;
		}
		System.out.println("결과 : " + s);
		
		
	
	}
}

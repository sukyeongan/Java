package ch04.unit03.forEx;

public class Ex04 {

	public static void main(String[] args) {
		/*
		int n;
		
		// 짝수
		for(n = 2; n <= 10; n+=2) {
			System.out.println(n + "  ");
		}
		System.out.println("\n밖:" + n); //12
		
		// 홀수
		for(n = 1; n <= 10; n+=2) {
			System.out.println(n + "  ");
		}
		System.out.println("\n밖:" + n); //11
		*/
		
		/*
		int s = 0;
		for(int n=1; n<=10; n++) {
			s+=n;
		}
		
		//System.out.println(n); //에러. for문 안에서 선언한 변수는 밖에서 사용불가
		System.out.println("결과:" + s);
		*/
		
		
		int n, s;
		for(n = 0, s=0; n<=10; s+=n, n++) 
			;
		System.out.println("결과:"+s); //55
		
		
		//잘못 코딩한 예
		s = 0;
		for(n=1; n<=10; n++) //; 찍으면 안됨
			s +=n;
		System.out.println(n + ", " + s); //
	}

}


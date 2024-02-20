package ch04.unit03;

public class Ex12 {

	public static void main(String[] args) {
		// 1~100까지 수의 합을 숫자가 10의 배수가 될때 마다 출력
		int s, n;
		
		s= n = 0;
		while(n < 100) {
			n ++;
			s +=n;
			if(n % 10 == 0) {
				System.out.println("1~" + n + "까지 합 : " + s);
			}
		}
		
	}

}



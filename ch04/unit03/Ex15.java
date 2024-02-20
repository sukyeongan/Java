package ch04.unit03;

public class Ex15 {

	public static void main(String[] args) {
		int s, n, cnt;
		
		s = 0;
		n = 1;
		cnt = 0;
		while(n < 100) {
			s +=n;
			
			System.out.printf("%5d",n);
			cnt++;
			if(cnt==5) {
				System.out.println();
				cnt = 0;
			}
			
			
			n +=2;
		}
		System.out.println("결과 : " + s);

	}

}

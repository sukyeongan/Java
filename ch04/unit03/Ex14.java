package ch04.unit03;

public class Ex14 {

	public static void main(String[] args) {
		// 1/2+2/3+3/4+...+9/10
	
		int n;
		double s = 0;
		
		n = 0;
		while(n < 9) {
			n++;
			s += (double)n / (n+1);
		}
		System.out.println("결과 : " + s);
	}

}

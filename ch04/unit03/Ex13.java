package ch04.unit03;

public class Ex13 {

	public static void main(String[] args) {
		//1 + (1+2) + (1+2+3)+...+(1+2+3+...+10)
		
		int s,n, ss;
		s = n = ss = 0;
		
		while(n<10) {
			n ++;
			s += n;
			ss += s;
		}
		
		System.out.println("결과 : " + ss );

	}

}

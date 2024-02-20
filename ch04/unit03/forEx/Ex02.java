package ch04.unit03.forEx;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		int a;
		for(a = 1; a <=10; a++) {
			System.out.print(a + "  "); //1	2 3 9
			
			if(a%3==0) {
				a += 5; // 반복횟수에 사용한 변수를 변경하면 반복횟수가 변경됨
			}
		}
		System.out.println("밖 a : " + a); //15
		*/
		
		/*
		int s, n;
		s = n = 0;
		while( n<10 ) {
			n++;
			s += n;
		}
		System.out.println(s);
		
		1) 1 ~10 까지의 합을 구하는 것
		*/
		
		int s = 0;
		for(int n = 1; n <= 10 ; n++) {
			s += n;
		}
		System.out.println(s);
	}

}


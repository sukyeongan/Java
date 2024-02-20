package ch04.unit03;

public class Ex22 {

	public static void main(String[] args) {
		/*
		double a;
		int n;
		n = 0;
		while(n < 100) {
			n++;
			// 0 <= a <1 사이의 난수 발생
			a = Math.random();
			System.out.printf("%.5f\t", a);
			if(n%10 == 0) {
				System.out.println();
			}
		}
		*/
		
		//1~100 사이의 난수를 한줄에 10개씩 출력 Math.random은 0~0.99999..
		// int n = (int)(Math.random() * 100);// 0~99 사이의 난수
		// int n = (int)(Math.random() * 100)+1;// 1~100 사이의 난수
		
		int a;
		int n = 0;
		while(n<100) {
			n++;
			a = (int)(Math.random() * 100)+1; //1~100 사이 난수
			System.out.printf("%5d", a);
			if(n%10 == 0) {
				System.out.println();
			}
		}
	}
}

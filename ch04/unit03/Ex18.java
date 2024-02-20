package ch04.unit03;

public class Ex18 {

	public static void main(String[] args) {
		// 2 ~ 9 단까지 구구단 출력
		int dan, n;
		
		dan = 2;
		while( dan <= 9) { //"="이 들어가야 9단까지 들어감
			System.out.println("**" + dan + "단 **");
			
			n = 0;
			while(n<9) {
				n++;
				System.out.printf("%d * %d = %d\n", dan, n, dan*n);
			}
			System.out.println();
			
			
			dan++;
		}

	}

}

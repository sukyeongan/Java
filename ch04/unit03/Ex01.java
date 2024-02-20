package ch04.unit03;

public class Ex01 {
	
	public static void main(String[] args) {
		
		/*
		int n;
		n = 10;
		while(n < 10) {
			n++;
			System.out.println(n+"  ");
		}
		System.out.println();
		*/
		
		
		int n;
		n = 0;
		while(n < 10) {
			n++;
			System.out.print(n + "  "); //1 ~ 10
		}
		System.out.println("\n"+n); //10
		
		
		/*
		 * int n; n = 0; while(n++ < 10) { System.out.print(n + "  "); //1 ~ 10 }
		 * System.out.println("\n" +n); // 11 System.out.println(); //n++은 10까지 나옴
		 */		
	}
}

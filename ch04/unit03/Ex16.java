package ch04.unit03;

//1~100까지 수중 3 또는 5의 배수를 제외한 수를 한 줄에 5개씩 출력하는 프로그램

public class Ex16 {

	public static void main(String[] args) {
		int n, cnt;
		
		n = 1;
		cnt = 0;
		
		while(n < 100) {
			n++;
			if(n%3 !=0 && n%5 !=0) { 
				System.out.print(n + "\t");
				cnt++;
				if(cnt%5 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println();

	}

}

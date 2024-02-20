package ch04.unit03.forQuizAnswer;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, t;
		
		System.out.print("두정수 ? ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2) { // 적은수는 n1, 큰수는 n2에 저장
			t = n1; n1 = n2; n2 =t;
		}
		
		int s = 0, count = 0;
		for(int i = n1; i <= n2; i++) {
			if(i %3 ==0 || i %5 == 0) {
				s +=i;
				count++;
				//System.out.print(i + " ");
			}
		}
		System.out.println("합:"+s);
		System.out.println("평균:"+(s/count));
		
		sc.close();
		
	}
	
}

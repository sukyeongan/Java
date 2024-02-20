package ch04.unit03.forQuizAnswer;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, odd, even;
		
		odd = even = 0;
		
		System.out.println("10개의 정수 입력...");
		for(int i=1; i<=10; i++) {
			n = sc.nextInt();
			if(n%2==0) { // if ( (n&1) == 0) {
				even++;
			} else {
				odd++;
				
			}
		}
		System.out.println("짝수 개수 : " + even);
		System.out.println("홀수 개수 : " + odd);
		sc.close();
	}

}

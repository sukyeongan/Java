package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ,even, odd;
		
		odd = even = 0;
		
		System.out.println("10개의 정수를 입력하세요.");
		for(int i = 1; i<=10; i++) {
			num = sc.nextInt();
			if(num%2==0){
				even++;
			}else {
				odd++;
			}
		}
			
		
		System.out.println("짝수 개수 : " + even);
		System.out.println("홀수 개수 : " + odd);
		sc.close();

	}
}

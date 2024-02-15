package ch03.unit01;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// 금액을 입력 받아 화폐단위별 매수 구하기
		// 금액 ? 67520 =>
		
		Scanner sc = new Scanner(System.in);
		
		int a;
	
		System.out.println("금액 ?");
		a = sc.nextInt();
		
		System.out.println("5만원권 : " + (a/50000));
		System.out.println("1만원권 : " + ((a%50000))/10000);	
		System.out.println("5천원권 : " + ((a%10000))/5000);
		System.out.println("1천원권 : " + ((a%5000))/1000);
		System.out.println("5백원권 : " + ((a%1000))/500);
		System.out.println("1백원권 : " + ((a%500))/100);
		System.out.println("5십원권 : " + ((a%100))/50);
		System.out.println("1십원권 : " + ((a%100))/10);
		System.out.println("5원권 : " + ((a%10))/5);
		System.out.println("1원권 : " + ((a%5)));
		
		
		
		sc.close();

	}

}

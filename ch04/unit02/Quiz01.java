package ch04.unit02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String g; //String변수 말고 char변수 잡아도 됨.
		
		System.out.print("점수 ? ");
		n = sc.nextInt();
		
		
		if(n >=0 && n <=100) {
			switch(n / 10) {
			case 10 :
			case 9: g= "수"; break;
			case 8: g = "우"; break;
			case 7: g= "미"; break;
			case 6: g = "양"; break;
			default : g = "가"; break;
			}
			System.out.println("점수 : " + n + ", 판정 : " + g);
		} else {
			System.out.println("입력 오류...");
		}
			
		sc.close();	
	}

}

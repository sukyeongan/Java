package ch04.unit03.forQuizAnswer;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//10개 정수를 입력받아 최댓값 구하기 - 방법1
		/*
		int max = 0x80000000; //가장 적은 값을 초기값으로
		int n;
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=1; i<=10;i++) {
			n = sc.nextInt();
			if(max < n) {
				max = n;
			}
		}
		*/
		
		/*
		//10개 정수를 입력 받아 최댓값 구하기 - 방법2 // 이게 젤 잘 짠 코드
		int max,n;
		System.out.println("10개의 정수를 입력하세요...");
		max = sc.nextInt(); // max에서 하나를 입력받았으므로
		for(int i=1;i<=9;i++) { //여기서 9번만 더 받으면 된다.
			n = sc.nextInt();
			if(max < n) {
				max = n ;
			}
		}
		*/
		
		int max = 100000000 ,n; // max = 0으로 해버리면 음수도 0이 나옴 max값을 설정해주지 않으면 컴파일 오류남
		System.out.println("10개의 정수를 입력하세요...");
		max = sc.nextInt(); // max에서 하나를 입력받았으므로
		for(int i=1;i<=9;i++) { //여기서 9번만 더 받으면 된다. / i가 1일때 젤 처음 입력받음
			n = sc.nextInt(); 
			if(i == 1 || max < n) {
				max = n ;
			}
		}
		
		
		System.out.println("최대값 : " + max);
		
		sc.close();
	}

}

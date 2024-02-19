package ch03.unit01;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 주행거리와 시속을 입력 받아 주행시간을 계산하는 프로그램
		// 주행시간은 시, 분, 초 까지 출력하고 초는 소수점 2째자리까지 출력
		/*
		   주행거리(KM) ? 123
		   시속 ? 100
		*/
		
		Scanner sc = new Scanner(System.in);
		int km, speed;
		int hour, min;
		double second;
		double time;
		
		System.out.print("주행거리(KM) ? ");
		km = sc.nextInt();
		
		System.out.print("시속 ? ");
		speed = sc.nextInt();
		
		time = (double)km / speed;
		hour = (int)time;
		min = (int)(time * 60 % 60);
		second = (time * 3600) % 60;
		second = (int)(second * 100) / 100.0; // 소수점 3째자리 버림
		System.out.printf("%d km => %d시간 %d분 %.2f초 소요 \n", km, hour, min, second);
		
		sc.close();
	}
}

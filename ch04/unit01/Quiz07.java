package ch04.unit01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		// 이름과 세과목 점수를 입력 받아 합격 여부 판별
		//  단 평균이 60이상이고 한과목이라도 40미만이면 과락
		Scanner sc = new Scanner(System.in);
		String name, s;
		int k, e, m;
		int tot, ave;
		
		System.out.print("이름 ? ");
		name = sc.next();
		
		System.out.print("세과목 점수 ? ");
		k = sc.nextInt();
		e = sc.nextInt();
		m = sc.nextInt();
		
		tot = k + e + m;
		ave = tot / 3;
		
		if(k>=40&&e>=40&&m>=40&&ave>=60) {
			s = "합격";
		} else if(ave >= 60) {
			s = "과락";
		} else {
			s = "불합격";
		}
		
		System.out.printf("%s님은 [%s] 입니다.\n", name, s);
		
		sc.close();
	}
}

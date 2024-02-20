package ch04.unit03.forQuizAnswer;

public class Quiz9 {

	public static void main(String[] args) {
		int s = 0;
		
		for(int i=1; i<=100; i++) {
			s += i;
			if(i%10 == 0) {
				System.out.printf("%d~%d까지 합 : %d\n", i-9, i, s);
				s = 0; // 값의 초기화를 해주어야 구간 별 제대로 된 합을 구할 수 있음
			
			}
		}
		
	}

}

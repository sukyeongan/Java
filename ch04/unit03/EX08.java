package ch04.unit03;

public class EX08 {

	public static void main(String[] args) {
		
		// 1*2*..*10의 결과
		int s, n;
		
		s = 1; // 얘 초기값으로 0주면 0만 나와버리므로 1이 나와야 함
		n = 0;
		while(n<10) {
			n++;
			s *=n;
		}
		System.out.println("결과 : " + s);
	}

}

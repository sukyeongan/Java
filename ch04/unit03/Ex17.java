package ch04.unit03;

public class Ex17 {

	public static void main(String[] args) {
		// 1 ~ 10 까지의 합을 무한 루프를 이용하여 계산
		int n, s;
		
		n = s = 0;
		while(true) { // 무한 loop
			n++;
			s += n;
			if(n==10) {
				break; //while 문을 빠져 나감
			}
		}
		System.out.println("결과 : " + s);
	}

}

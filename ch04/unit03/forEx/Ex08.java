package ch04.unit03.forEx;

public class Ex08 {

	public static void main(String[] args) {
		// 무한 루프
		
		int n, s;
		n = s = 0;
		
		//while(true) {//와 동일
		for(;;) { //조건자리에 아무것도 없거나  true 이면 무한루프
			n++;
			s+=n;
			if(n==10) {
				break;
			}
		}
		
		System.out.println("결과:" + s);

	}

}

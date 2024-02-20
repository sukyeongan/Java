package ch04.unit03.forEx;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		int n;
		for(n = 10; n <= 1; n--) {
			System.out.print(n+" "); // 조건이 거짓이면 한번도 실행 안함
		}
		System.out.println("\n밖 : " + n); //10
		*/
		
		
		
		int n;
		for(n = 10; n >= 1; n--) { // 여기라인에 ";" 안쓰게 주의!
			System.out.print(n+" "); // 10,9,...2,1
		}
		System.out.println("\n밖 : " + n); //0
		
	}

}







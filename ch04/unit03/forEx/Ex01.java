package ch04.unit03.forEx;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 for(초기치; 조건식; 증감식){
		 	실행문;
		 	}
		 	
		 	조건식 :  true 또는 fals, false 이면 for 문을 빠져 나감
		 	초기치 -> 조건식(참이면) ->실행문
		 			조건식(참이면) ->실행문
		 			조건식(참이면) ->실행문
		 				.
		 				.
		 			조건식이 거짓이면 for문을 빠져나감
		 		
		 */
		
		/*
		int n;
		for(n = 1; n <=10; n++) {
			System.out.print(n + "  "); // 1 ~ 10
		}
		System.out.println("\n밖 : " + n); // 11
		*/
		
		
		//for 안에서 선언한 변수는 for 안에서만 사용 가능
		for(int n = 1; n<=10; n++) {
			System.out.print(n+"  "); //1~10
		}
		//System.out.println("\밖 : " + n); //컴파일 오류
		
		
	}

}

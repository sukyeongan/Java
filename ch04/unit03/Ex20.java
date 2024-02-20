package ch04.unit03;

public class Ex20 {

	public static void main(String[] args) {
		int n;
		
		n = 10;
		while(n<10) { //조건을 만족하지 않으면 한번도 실행하지 않는다.
			n++;
			System.out.println("while 안 :"+ n);
		}
		System.out.println("while 밖 : " + n);
		
		n = 10;
		do { //적어도 한번은 실행한다.
			n++;
			System.out.println("do while 안 : " + n); //11
		} while(n<10);
		System.out.println("do while 밖 : " + n); //11

	}

}

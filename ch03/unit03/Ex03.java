package ch03.unit03;

public class Ex03 {

	public static void main(String[] args) {
		int a = 13, b = 10;
		
		System.out.println(a + " : " +  (a%2==0) ); // false
		System.out.println(b + " : " +  (b%2==0) ); // true

		// & 이 == 보다 연산 순위가 느림
		System.out.println(a + " : " +  ((a&1)==0) ); // false
		System.out.println(b + " : " +  ((b&1)==0) ); // true
		
		// a:13=>1101      b:10=>1010
		//   &   0001        &   0001
		// =>    0001        =>  0000
	}

}

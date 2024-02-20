package ch04.unit03.forEx;

public class Ex05 {

	public static void main(String[] args) {
		int s, n;
		
		s = 0;
		for(n=1; n<=10; n++) {
			s += n;
			System.out.println(n +":"+s+" ");
		}
		System.out.println("\n밖 : "+ n + ","+ s);
	}

}

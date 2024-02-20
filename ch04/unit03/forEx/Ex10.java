package ch04.unit03.forEx;

public class Ex10 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println("i:" + i);
			
			for(int j=1; j<=2; j++) {
				System.out.println("i:"+i+", j:"+j);
			}
			System.out.println("----------");
		}

	}

}

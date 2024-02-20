package ch04.unit04;

public class Ex01 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		
		//break : while,do~while,for,switch~case 문에서 사용
		while(true) {
			n++;
			s += n;
			if(n==10) {
				break;
			}
		}
		
		System.out.println("결과:"+s);
		
	}

}

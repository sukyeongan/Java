package ch08.unit03;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		int a;
		Object obj = "korea"; // up casting
		a = ((String)obj).length();
		System.out.println("길이:" + a);
		
		Object n1 = 10; //Integer
		Object n2 = 20; //Integer
		// Object n3 = n1 + n2; //컴오류
		int n3 = (Integer)n1 + (Integer)n2; // 다운 캐스팅
		System.out.println(n3);
		
		//Object[] oo = {"seoul", 80,70,"korea"};
		// Arrays.sort(oo); // 여기서 터짐/ 런타임 오류 =>  sort불가
		
		Object[] oo = {"seoul", "korea" , "jeju"};
		Arrays.sort(oo);
		System.out.println(Arrays.toString(oo));
	}
}

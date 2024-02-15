package ch02.unit03;

public class Ex03 {

	public static void main(String[] args) {
		// byte < short < int < long < float < double
		//		  char < int < long < float < double
		
		float f1 = 0; // 단정도형. int 형의 값을 float에 대입
			//float f2 = 0.5; //컴파일 오류, 0.5 : 배정도형(double)실수
		float f2 = 0.5f; // 0.5f : 단정도형 리터널
		float f3 = 1.2e04f;
		float f4;
		f4 = 'A';
		System.out.println(f1 + ","+f2+","+f3+","+f4);
		
		double d1 = 0.5;
		double d2 = 3.14D;
		double d3 = 1.2e04, d4 = 1.2e-04;
		System.out.println(d1+","+d2+","+d3+","+d4);
			//0.5,3.14,12000.0,1.2E-4
		System.out.printf("%.5f\n", d4); // 0.00012
		
		// f4 = d1;//컴파일 오류
	}

}

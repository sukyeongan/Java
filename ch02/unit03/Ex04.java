package ch02.unit03;

public class Ex04 {

	public static void main(String[] args) {
		int i1 = 2_000_000_000;
		int i2 = 2_000_000_050;

		float f1 = 2_000_000_000;
		float f2 = 2_000_000_050;

		double d1 = 2_000_000_000;
		double d2 = 2_000_000_050;
		System.out.println("int : " + i1 + "," + i2);
		System.out.printf("float : %.2f, %.2f\n", f1, f2);
		System.out.printf("doule : %.2f, %.2f\n", d1, d2);

	}

}

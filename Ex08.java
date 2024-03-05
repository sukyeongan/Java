package ch09.unit03;

public class Ex08 {

	public static void main(String[] args) {
		// divide(10, 5);
		// divide(10,0);
		divide(10, -5);
	}
	public static void divide(int a, int b) {
		try {
			if(b<0) {
				System.out.println("음수를 입력 했습니다.");
				return;
			}
			
			int c = a / b;
			System.out.printf("%d / %d = %d\n", a,b,c);
			
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			// System.exit(0); 을 만날때만 실행하지 않음
			System.out.println("finally 블록은 return을 만나도 실행...");
		}
	}	
}
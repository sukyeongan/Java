package ch04.unit04;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					break; // 두번째 for문장만 나감
				}
				System.out.println("i:" + i + ", j:" + j);
			}
		}
		*/
		
		gogo:
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					break gogo; // 전체for문장 나감
				}
				System.out.println("i:" + i + ", j:" + j);
			}
		}
		
	}

}

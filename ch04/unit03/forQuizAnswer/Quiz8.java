package ch04.unit03.forQuizAnswer;

public class Quiz8 {

	public static void main(String[] args) {
		//주사위 두 눈 의 합이 9
		
		for(int i=1; i <=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == 9) {
				//System.out.println("["+i+","+j+"]");
					System.out.printf("[%d, %d]\n", i, j); // 보다 간결
				}
			}
		}

	}

}

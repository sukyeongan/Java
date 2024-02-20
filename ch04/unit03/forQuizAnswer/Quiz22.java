package ch04.unit03.forQuizAnswer;

/*
	
	 *       4+1
	***      3+3
   *****     2+5
  *******    1+7
 *********   0+9
  *******    1+7
   *****     2+5
	***      3+3
	 *       4+1

*/



public class Quiz22 {

	public static void main(String[] args) {
		// for문장 두개로 21번 예제와 똑같이 구현
		
		int size = 9; //출력해야 할 줄수는 총 9줄
		int n;
		
		n = size / 2;
		for(int i=0; i<size; i++) { //0~8까지 총 "9"번 반복
			for(int j=0; j<(size-n); j++) {
				System.out.print((j>=n?"*":" "));
			}
			n = i < (size)/2 ? n-1:n+1;
			System.out.println();
		}
		
	}
}
	


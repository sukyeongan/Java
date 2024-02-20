package ch04.unit03.forQuizAnswer;

/*
 
      *
     **
    ***
   ****
  *****
  
 */

public class Quiz18 {

	public static void main(String[] args) {
		for (int i=1; i <= 5; i++) {
			for(int j=1; j<=5-i; j++) { // i=1, j=1~4
				System.out.print(" ");
			}
			
			for (int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}

package ch02.unit03;

/*
 String : 문자열을 나타내는 클래스
 */

public class Ex06_String {

	public static void main(String[] args) {
		String s1, s2,s3;
		
		s1 = "korea";
		s2 = "seoul";
		
		s3 = s2 + s1; // 문자열 + 문자열 => 문자열(결합)
		System.out.println(s3); //seoulkorea
		
		s3 = ""; // 길이가 0인 문자열
		System.out.println(s3);
		
		s3 = "X" + 'A' + 10; //문자열 + 일반자료형 => 문자열로 결합
		System.out.println(s3); //XA10
		
		s3 = 'A'+ 10 + "X";
		System.out.println(s3); //"75X"
		
		s3 = 'A'+ "X" + 10 ; //여기도 마찬가지로 문자열로 결합
		System.out.println(s3);

	}

}

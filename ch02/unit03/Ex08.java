package ch02.unit03;

/*
 -문서화 주석
  1) 문서화 주석 만들기
  	javadoc -use 클래스명.java -d 저장할경로
  2) 예 : doc 폴더가 없으면 doc 폴더를 만들고 그 안에 HTML로 문서화 주석을 만
  	cmd> javadoc -use Ex08.java -d doc
 */

public class Ex08 {
	/**
	 * 짝수인지 판별하는 메소드
	 * <p>정수를 2로 나눈 나머지가 0이면 짝수이다. </p>
	 * @param num 짝수인지 판별할 수 <code>int</code>
	 * @return	  짝수여부를 반환한다. <code>boolean</code>
	 */
	public boolean isEven(int num) {
		return num%2 == 0;
	}
}


//boolean <=>int 비교 불가

//short char(음수가 없음) 배교불가 but 캐스팅하면 가능

//
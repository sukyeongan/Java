package ch02.unit02;

public class Ex04_printf {

	public static void main(String[] args) {
		// System.out.printf("%d %d\n", 12); // 런타임오류 => 프로그램은 종료
		
		// %d 정수 출력
		System.out.printf("%d\n", 12345);
		System.out.printf("%d\n", -12345);
		System.out.printf("%,d\n", 12345); //  세자리마다 , 출력
		
		// System.out.printf("%d\n", 2200000000); // 컴파일 오류
			// 2200000000 : int 범위 초과
		System.out.printf("%d\n", 2200000000L);
			// 2200000000L : long 형 리터널
		System.out.println();
		
		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123); // 앞에 7칸공백
		System.out.printf("%010d\n", 123); // 남는 자리수에 0으로 채움
		System.out.printf("%-10d*\n", 123); // 남는 자리는 뒤에 공백
		System.out.printf("%2d\n", 123); // 정수 자리수가 부족하면 자리수는 무시하고 모두 출력
		System.out.println();
		
		System.out.printf("%d\n", 123); // 123
		System.out.printf("%d\n", -123); // -123
		System.out.printf("%+d\n", 123); // +123
		System.out.printf("%+d\n", -123); // -123
		System.out.printf("%(d\n", 123); // 123
		System.out.printf("%(d\n", -123); // (123)
		System.out.println();
		
		// 문자 : 'a', 'A', '1', '대' ..
		// 'a' ASCII 코드 : 97, 'A' : 65, '0' : 48
		System.out.printf("%c\n", 'a'); // a
		System.out.printf("%c\n", 'A'); // A
			// %c : 문자 출력
		System.out.printf("%C\n", 'a'); // A
		System.out.printf("%C\n", 'A'); // A
			// %C : 소문자인 경우 대문자로 변환하여 출력
		System.out.printf("%c\n", 67); // C
		System.out.printf("%c\n", 99); // c
		System.out.printf("%c", 10); // 라인넘김(10:엔터)
		System.out.println("---");
		// System.out.printf("%d\n", 'A'); // 런타임 오류. %d:문자출력불가
				// IllegalFormatConversionException 예외 발생
		System.out.println();
	}	
}

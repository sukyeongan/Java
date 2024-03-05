package ch09.unit03;

public class Ex12_throws {

	public static void main(String[] args) {
		User12 u = new User12();
		
		try {
			u.setValue(-5);
			int n = u.getValue();
			System.out.println(n);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}
	
		System.out.println("end...");
	}
}

class User12 {
	private int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) throws Exception  { // 메소드를 호출한 곳에서 catch 하도록 설정
		if ( value < 0) {
			// 강제로 checked exception을 발생
			throw new Exception("0이상만 가능합니다.");
		}
		this.value = value; 
	}
}
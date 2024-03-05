package ch09.unit03;

public class Ex13 {
	public static void main(String[] args) {
		Test13 t = new Test13();
		
		t.setValue(-5);
		int n = t.getValue();
		System.out.println(n);
	}
}

// 잘못 작성한 코드
class Test13 {
	private int value;

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		try {
			if(value<0) {
				throw new Exception("0이상만 가능합니다.");
			}
			
			this.value = value;
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

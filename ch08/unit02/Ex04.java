package ch08.unit02;

public class Ex04 {
	public static void main(String[] args) {
		Test4 t1 = new Test4("101", "이자바");
		Test4 t2 = new Test4("101", "이자바");
		
		System.out.println(t1 == t2); // 주소비교. false  -> false
		System.out.println(t1.equals(t2)); // 주소비교. false -> true
		
		// 내가 원하는건 equals를 가지고 주소가 아닌 값을 비교하는 형식으로 바꾸는 것.
	}
}

// Object의 equals() : 주소 비교
// Object의 equals() 메서드를 재정의
class Test4 {
	private String hak;
	private String name;
	
	public Test4() {	
	}
	public Test4(String hak, String name) {
		this.hak = hak;
		this.name = name;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) { // main 클래스의 t2를 object가 받음.
		Test4 t = (Test4)obj; // 다운캐스팅

		return hak.equals(t.hak) && name.equals(t.name);
	}

}

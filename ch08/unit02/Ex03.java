package ch08.unit02;

public class Ex03 {
	public static void main(String[] args) { 
		Demo3 obj = new Demo3();
		
		obj.setName("이자바");
		obj.setAge(20);
		
		System.out.println(obj.toString());
		System.out.println(obj);
	}
}

// Object 클래스의 toString() 메소드 재정의
class Demo3{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() { // 이렇게 했더니 결과자체가 다르게 나옴 아까는 클래스@해쉬코드이름
		return name + "\t"+ age;
	}
}

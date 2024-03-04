package ch08.unit02;

public class Ex02 {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.setName("이자바");
		obj.setAge(20);
		
		System.out.println(obj.getName() + ","+ obj.getAge());
		System.out.println(obj); //클래스이름@해쉬코드
		System.out.println(obj.toString()); //클래스이름@해쉬코드
	}
}


class Demo2 {
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
	
}

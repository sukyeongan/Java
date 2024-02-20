package ch04.unit03.forEx;

public class Ex09 {

	public static void main(String[] args) {
		
		//float는 정밀도가 낮아 for의 반복횟수에서 사용하면 안됨
		int start = 50;
		int count = 0;
		
		for(float f = start; f <start + 50; f++) {
			count++;
		}
		System.out.println("count : " + count); //0
		
		
		
		/*
		float a = 2000000000;// 20억
		float b = 2000000050;//20억 5십
		System.out.println(a == b); // true
		*/
		
	}

}
//float은 단정도형이기 때문에 정밀도가 낮다.
package ch04.unit03;

public class Ex19 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		while(n<10) { //{전에 ; 찍으면 안됨
			n++;
			s+=n;
		}
		System.out.println("while => n:" + n + ", S:" + s);
		
		n = s = 0;
		do {
			n++;
			s += n;
		} while(n < 10);
		System.out.println("do while => n:" + n + ", s:" + s);
	}

}

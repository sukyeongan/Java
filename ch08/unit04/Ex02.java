package ch08.unit04;

public class Ex02 {
	public static void main(String[] args) {
		int[] nn = {35,20,15,40,30,25};
		
		// SortInt si = new SelectionSort();
		SortInt si = new BubbleSort();
		
		disp("source data", nn);
		
		si.sort(nn);
		
		disp("sort data", nn);
		}
	
	
	public static void disp(String title,int[] value) {
		System.out.print(title+ " : ");
		for(int n : value) {
			System.out.print(n+ " ");
		}
		System.out.println();
	}
}

abstract class SortInt {
	private int[] value;
	
	protected abstract void sorting();
	
	public void sort (int[] value) {
		this.value = value;
		sorting(); 
	}
	
	protected int length() {
		int n = -1;
		
		if(value != null){
			n = value.length;
		}
		
		return n;
	}
	
	// 배열의 두 요소 비교
	protected final int compre(int i, int j) {
		return value [i] - value[j];
	}
	
	// 배열의 두 요소 교환 swapping 배열속에 있는 값을 맞바꾸는 것.
	protected final void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}
}

class SelectionSort extends SortInt {
	@Override
	protected void sorting() {
		for(int i = 0; i< length()-1; i++) {
			for(int j=i+1; j<length(); j++) {
				if(compare(i,j)>0) {
					swap(i, j);
				}
			}
		}
	}

	private int compare(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}	
}

class BubbleSort extends SortInt {
	@Override
	protected void sorting() {
		boolean flag = true;
		
		for(int i=1; flag; i++) {
			flag = false;
			for(int j=0; j<length()-i; j++) {
				if(compare(j,j+1) > 0) {
					swap(j,j+1);
					flag = true;
				}
			}
		}
		
		
	}

	private int compare(int j, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
package com.day10;

abstract class SortInt{
	private int [] value;  // 클래스라 초기값 null =null 생략된것. 
	protected abstract void sorting(); //추상메소 ( 자기자신 오버라이드된 곳에 가서 실행됨) 

	public void sort(int [] value) { //private 우회도로 ' 배열로 받을때의 형태.'
		this.value=value;
		
		sorting(); // 추상메소드 호출  ????????

	}

	public int length() {
		if(value==null) 
			return 0;
		return value.length;
	} //return value.length;

	protected final int compare(int i ,int j) {
		if(value[i]==value[j]) 
			return 0;
		else if (value[i]>value[j])
			return 1;
		else
			return -1;
	}

	protected final void swap (int i, int j ) {
		int tmp;
		tmp =value[i];
		value[i]= value[j];
		value[j]=tmp;

	}

	public void print() {
		if(value == null)
			return ;
		for(int n: value) {
			System.out.printf("%5d",n);
		}
		System.out.println();
	}

}


class SortTest extends SortInt{

	@Override
	protected void sorting() { // 자식꺼 쓰는 부분이 여긴가.  (위에서 추상메소드 호출하면 오는 곳) 

		//selection sort 
		for(int i=0; i<length()-1; i++) { // 메소드 호출?
			for(int j=i+1;j<length(); j++) {
				if(compare(i, j)>0) {
					swap(i, j);
				}
			}
		}
	}
}

public class Test12 {

	public static void main(String[] args) {
		
		int value[]= {99,88,54,63,22};
		SortTest ob= new SortTest();
		
		ob.sort(value);
		ob.print();

	}

}

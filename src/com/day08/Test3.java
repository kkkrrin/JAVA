package com.day08;

class RectA{

	private int w,h;

	public RectA() {
		// 기본 생성자
	}
	public RectA(int w, int h) { //  생성자 오버로딩 , 객체 생성 , 변수초기화 
		this.w=w;
		this.h=h;
	}

	public void set(int w, int h) { // 기본생성자의 우회도로 , 변수 초기화 메소드 
		this.w=w;
		this.h=h;
	}

	public int area() {
		return w*h;
	}

	public int length() {
		return (w+h)*2;
	}

	public void print(int a, int l) {
		System.out.println("가로:"+w);
		System.out.println("세로 : "+h);
		System.out.println("넓이 :"+a);
		System.out.println("둘레: "+l);
	}

	public void print(int a) {  // 메소드 오버로딩 
		System.out.println("가로:"+w);
		System.out.println("세로 : "+h);
		System.out.println("넓이 :"+a);
	}

}

public class Test3 {

	public static void main(String[] args) {
		//1. 기본생성자로 객체 생성
		RectA ob1 =new RectA();
		ob1.set(10, 20);
		int a=ob1.area();
		int l=ob1.length();
		ob1.print(a);
		ob1.print(a, l);

		System.out.println("----------------------");

		//2. 오버로딩된 생성자로 객체 생성 
		RectA ob2 =new RectA(100,200); //set메소드 사용하지않고 바로 값 줄 수 있음. 
		a=ob2.area(); //위에 int 선언 돼있음. 
		l=ob2.length();
		ob2.print(a);
		ob2.print(a, l);

		System.out.println("----------------------");
		// 중간에 값을 바꿔야 하는 경우
		ob2.set(50,60); // (오버로딩된 생성자이지만) 메소드를 사용한다. 
		a=ob2.area(); //위에 int 선언 돼있음. (변수 재사용) 
		l=ob2.length();
		ob2.print(a);
		ob2.print(a, l);

	}

}

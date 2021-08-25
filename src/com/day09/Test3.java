package com.day09;
// 조상을 메모리에 먼저 올려야한다. ! 
// 기본생성자를 명시하던가, 오버로딩생성자를 찾아가도록 값을 주던가 해야한다. 

class TestB{
	private String title;
	protected int area; 
	
	public TestB(String title) { // 생성자로 초기화  ( 오버로딩된 생성자) 
		this.title =title;
		
	}
	public void print() {
		System.out.println(title+":"+area);
	}
	
}

class RectB extends TestB{ // error가 나는 이유 밑에 
	private int w,h;
	
	public RectB(int w, int h) { 
		
		super("사각형");  // 값을 줌으로써 오버로딩된 생성자를 찾아간다. 
	
		//super(); 기본 생성자가 존재한다.(생략돼있음) ( 부모를 메모리에 올리기 위해) 부모클래스의 기본생성자를 찾으러간다. 
		// 하지만 위에 오버로딩된 생성자를 선언햇기 때문에 오류가 난다. 
		//- 기본생성자를 선언해주던가,  super("사각형"); 값을 줘서 오버로딩 생성자를 찾아가던가. 
		
		this.w=w;
		this.h=h;
		
	}
	
	public void rectArea() {
		area=w*h;
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		RectB ob =new RectB(10, 20); // 자식으로 객체생성 
		ob.rectArea();
		ob.print();
		
	}

}

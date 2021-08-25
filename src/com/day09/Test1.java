package com.day09;
// 상속 (부모->자식) 
// 1. 부모꺼는 내 꺼 
// 2.private로 선언한것은 상속 불가. 
// 3.protected로 선언한 것은 상속 가능. 
// 4. 내꺼는 내 꺼
// 5. 부모와 자식이 같은 객체를 가지고 있으면 자기꺼 (내 것) 쓴다. 
// 자바에서 상속은 단일 상속  a->b->c ( 다중상속도 잇음) 
// 자바에서 상속보다 인터페이스를 많이 쓴다. ( 인터페이스도 상속의 하나- 다중상속사용) 

class Test{
	private String title;
	private int area; 

	public void set (String title, int area) {
		this.title = title;
		this.area=area;
	}
	public void print() {
		System.out.println(title +":"+area);
	}
}

class Rect extends Test { //  test 를 부모로 만든다.extends
	private int w,h;
	public Rect(int w,int h){
		this.w=w;
		this.h=h;
	}

	public void rectArea() {
		int a=w*h;
		set("사각형", a); //1. 부모꺼 내꺼 
	}
}

public class Test1 {
	public static void main(String[] args) {
		Rect ob =new Rect(10, 20);
		ob.rectArea();
		ob.print(); //부모의 print 메소드 (1) 

	}
}

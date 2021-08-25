package com.day09;
// 상속 (부모->자식) 
// 1. 부모꺼는 내 꺼 
// 2.private로 선언한것은 상속 불가. 
// 3.protected로 선언한 것은 상속 가능. 
// 4. 내꺼는 내 꺼
// 5. 부모와 자식이 같은 객체를 가지고 있으면 자기꺼 (내 것) 쓴다. 
// 자바에서 상속은 단일 상속  a->b->c 
// 자바에서 상속보다 인터페이스를 많이 쓴다. ( 인터페이스도 상속의 하나- 다중상속사용) 

class TestA{
	private String title;
	protected int  area; // 3.protected로 선언한 것은 상속 가능. 

	public void set (String title) { //메소드로 초기화 
		this.title = title;
		}
	
	public void print() {
		System.out.println(title +":"+area);
	}
}


class RectA extends TestA { //  testA 를 부모로 만든다.extends
	private int w,h;
	public RectA(int w,int h){
		this.w=w;
		this.h=h;
	}

	public void rectArea() {
		area = w*h;
		set("사각형"); //1. 부모꺼 내꺼 
	}
}

public class Test2 {
	public static void main(String[] args) {
		RectA ob =new RectA(10, 20);
		ob.rectArea();
		ob.print(); //부모의 print 메소드 (1) 

	}
}

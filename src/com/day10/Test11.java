package com.day10;
//추상클래스
// 반드시 1개 이상의 추상 메소드를 가지고 있어야 한다. 
// - 비슷한거 interface 

abstract class ShapeClass{ //추상 클래스 
	public abstract void draw(); //{} 없음. - 내용이 없다
	
}
// 추상클래스 상속받으면 메소드 반드시 오버라이드 해야됨. 
class Circ extends ShapeClass{ 
	@Override
	public void draw() {
		System.out.println("원을 그린다...");
				
	} 
}

class Rect extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("사각형을 그린다 ...");		
	}
}

class Tria extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다...");		
	}	
}

public class Test11 {

	public static void main(String[] args) {
		
		Circ c=new Circ();
		Rect r =new Rect();
		Tria t= new Tria();
		
		// 각각 추상메소드가 실행된다. 
		c.draw();
		r.draw();
		t.draw();
		
	}

}

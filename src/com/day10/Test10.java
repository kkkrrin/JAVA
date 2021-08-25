package com.day10;
//final - 상수, 반드시초기화, 선언된 값 수정불가.
//final 을 붙일 수 있는 3가지 경우 
// 1. instance 변수 ( 전역/멤버 변수) - final 붙이면, 한번만 초기화 가능. (불변)
// 2. method - final 붙이면, Override 불가능 ( 자식이 갖다 쓸 수 없다?) 
// 3. class - final  붙이면, 상속이 불가능 

/*final */class TestA{ // -3
	public static final double PI; //=3.14;  선언 가능. 

	static {
		PI=3.14;
	}
	
	public double area; // instance 변수 
	
	public final void write(String title) { // method 
		System.out.println(title+":"+area);
	}
}

public class Test10 extends TestA { // 부모만듬. 
	//public final void write(String title) { } // 2. final method = override 불가. 

	
	public void circleArea(int r) {
		area =(double)r*r*PI;
	}

	
	public static void main(String[] args) {
		
		Test10 ob= new Test10();
		
		ob.circleArea(10);
		ob.write("원");
		

	}

}

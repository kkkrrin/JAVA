package com.day08;
// 생성자 
//1. 메모리 할당받을 때 사용한다. (객체생성)
//2. Instance변수를 초기화할 때 사용한다. 

import java.util.Scanner;

// 오버로딩이 가능하다. (중복정의)
//생성자는 클래스의 이름과 동일하다.  Rect ob=new Rect();
// 리턴값이 없기 때문에 property가 없다. (void자리) 
// 생성자 안에서 생성자를 호출할 수 있다. ( 메소드-메소드 호출과 같은 맥락) 
//  -단, 선두에서만 호출 가능. 

public class Test2 {
	
	private int x; 
	
	//public Test2() {} // 밑에 주석처리하고 오버로딩 하면 오류가 나기때문에 해준 일. 
								// 객체 생성을 위해 하는 것. 
	
	public Test2() { // 기본 생성자 ( 생략가능, 숨겨져있음) 
		//this(20); //생성자에서 생성자 호출 가능, ( 선두에서만 가능 ) 
		System.out.println("기본 생성자.");
		x=10;  // 기본생성자는 그냥 초기화 가능
		System.out.println("x:"+x);
	}
	
	public Test2(int x ) { // 기본생성자가아니니까 this를 해준다?
		this();
		System.out.println("overoading된 생성자");
		this.x=x;
		System.out.println("x:"+this.x);

	}
	public void set(int x) { //우회도로 - 초기화 작업 
		this.x=x;
		
	}
	public void print() {
		System.out.println(x);
	}
		
	public static void main(String[] args) {
		//Test2 ob =new Test2(); //Test2() 가 어디 있는지. 
		Test2 ob1=new Test2(20);
	
//		ob.set(10);
//		ob.print();
		
	}

}

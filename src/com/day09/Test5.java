package com.day09;
//object : 최고점에 잇는 클래스  근본?
// 모든 클래스의 부모 Object  클래스이다. 
// 모든 클래스란? 내가 만든 클래스 + 이미 만들어져 있는 클래스. 

class TestClass{ //extends Object 가 생략되어있다. 
	
	private int a =10;
	
	public void write() {
		System.out.println("a:"+a);	
	}
}

public class Test5 {

	public static void main(String[] args) {
		
		TestClass ob1 = new TestClass();
		TestClass ob2 = new TestClass();	
		
		// 주소비교 
		System.out.println("ob1==ob2 : "+(ob1==ob2)); //false
		System.out.println("ob1.equals(ob2) : "+ob1.equals(ob2)); //false
		System.out.println(ob1); //주소 출력 day.com09.TestClass@2a139a55 -> 'hash code'
		System.out.println(ob2); 
		System.out.println(ob1.toString()); //문자로 바꿔서 출력->day.com09.TestClass@2a139a55
 
	}
}

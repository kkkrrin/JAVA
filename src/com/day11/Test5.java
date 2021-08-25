package com.day11;
// 내부 클래스 ( 클래스 안 클래스) 
// 1.Inner 

class Outer1{
	
	static int a =10;
	int b=20;
	
	//Outer1가 객체생성이 안되면 Inner도 생성이 안된다. 
	//Outer1가 생성됐다고 해서 Inner가 생성된 것은 아니다.  ( 따로 생성해줘야한다) 
	public class Inner1{
		int c=30;
		
		public void write() {
			System.out.println(a); 
			System.out.println(b);
			System.out.println(c);
		}
	}
	
	public void print() { // Outer 클래스 안에 있는 거지만 Inner1 생성이 가능. 
		Inner1 ob = new Inner1();
		ob.write();
	}
	
}

public class Test5 {
	public static void main(String[] args) {
		
		//1. 객체생성 방법. 
		Outer1 out = new Outer1();
		out.print();
		
		//2. 객체생성 방법. 
		Outer1.Inner1 in= out.new Inner1();
		in.write();

		
		
		
	}

}

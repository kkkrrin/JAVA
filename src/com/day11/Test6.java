package com.day11;
//2. 내부클래스 (Local)

class Outer2{
	static int a=10;
	int b=20;
	
	public void write() {
		int c=30;
		final int d=40;
		
		class Inner2{ // 메소드 안에 클래스. 
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		
		Inner2 ob = new Inner2();  // write 메소드에서 객체생성 
		ob.print();
		
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		Outer2 ob = new Outer2();
		ob.write();
		
	}

}

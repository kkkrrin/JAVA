package com.day08;

import java.util.Scanner;

class Rect{ // 연산, 출력 .. * 같은패키지 안에 같은 이름으로 선언하는거 주의하
	private int w,h; // 외부 접근 막기위해 private 

	public void set(int w,int h) { // 변수 접근을위해 우회도로 생
		this.w=w;
		this.h=h;  // this=classRect
	}

	public int area() {
		return w*h;
	}

	public int length() { // 둘레 
		return (w+h)*2;
	}

	// 메소드 중복정의 (overloading)
	// 하나의 클래스 안에서 ! 같은 역할을 하는 메소드의 이름을 통일 시키는 것. 
	// 메소드의 이름은 동일하지만, 괄호 속 인수의 갯수나 자료형이 다르면 다른 메소드로 인식.
	
	public void print(int a, int l) {
		System.out.println("가로:"+w);
		System.out.println("세로 : "+h);
		System.out.println("넓이 :"+a);
		System.out.println("둘레: "+l);
	}

	public void print() {
		System.out.println("가로:"+w);
		System.out.println("세로 : "+h);
	}

	public void print(int a) {
		System.out.println("가로:"+w);
		System.out.println("세로 : "+h);
		System.out.println("넓이 :"+a);
	}
	
	// 위에 메소드와 매개변수 개수와 자료형이 같기 때문에 print로 오버로딩 할 수 없다. 
	// 매개변수의 자료형을 바꿔주면 가능.
	public void jk(int l) {  
		System.out.println("가로:"+w);
		System.out.println("세로 : "+h);
		System.out.println("둘레: "+l);
		
	}
}

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rect ob = new Rect();
		int w,h;
		System.out.print("가로와 세로 입력 : ");
		w=sc.nextInt();
		h=sc.nextInt();

		ob.set(w,h);
		int a = ob.area(); //a,l위에 변수로 생성가능 
		int l = ob.length();
		
		ob.print();
		ob.print(a);
		ob.print(a, l);
	
//		ob.print(a, l);
//		ob.write();
//		ob.chul(a);
//		ob.jk(l);

	}
}

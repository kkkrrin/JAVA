package com.day08;

public class Test4 {

	int a=5; //instance 변수 (new 만나야 메모리에 올라감) 
	{ // 초기화블럭 한번만 실행되는 것 ?
		System.out.println("초기화 블럭 a : "+a);
		a=10; 
		System.out.println("초기화 블럭 a :"+a);
		
	}
	static int b; 
				// static 은 run 로딩만 하면 메모리 자동 올라간다. 
	static { // static 블럭 / 한 번만 실행 ( 메모리에 자동 올라감)-> main문에 코딩이 없어도 출력됨 
		b= 10; 
		System.out.println("static block b : "+b);
	}
	
	//final=한번 상수(변수)를 선언하면 종료될때까지 바뀌지 않음. 항상 같은 수. (변경x)
	// 대문자로 선언. 
	final int C;  // 여기서 초기화 해줘도 됨. 
	
	public Test4() { // 생성자. 
		System.out.println("기본 생성자 ...");
		C=100;
		System.out.println("상수 C:"+C);
	}
	
	public static void main(String[] args) {
		Test4 ob = new Test4();
		Test4 ob1 = new Test4();
		
	}

}

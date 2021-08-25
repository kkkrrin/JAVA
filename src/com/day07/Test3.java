package com.day07;
//	static 
// 1. 스스로 메모리 할당을 받는다.
// 2. 객체가 천 번 생성되더라도 메모리 공간은 (처음 만든 공간)"하나"만 사용한다.

public class Test3 {
	//클래스 변수, 클래스 메소드는 클래스가 로딩되는 순간 (run)  
	//메모리 할당이 이루어지며 [클래스 이름.객체이름] 으로 접한다.
	// 즉 new를 통해 메모리 할당을 받지 않아도 메모리 사용이 가능하다. 

	// 클래스 변수 
	public static int a=10; //static 은 눕는다. 

	//instance변수 + 메소드 
	//new 를 통해서만 메모리 할당을 받을 수 있다. 
	//instance 변수는 동일한 instance 메소드에서만 접근이 가능
	//class 메소드 에서는 접근 불가능. 

	//instance변수
	private int b=20;

	//instance 메소드 
	public void write() {
		System.out.println("class 변수 a :" +a);
		System.out.println("instance 변수 b :" +b);


	}
	// 클래스 메소드 
	public static void print() {
		System.out.println("class 변수 a :" +a);
		//System.out.println("instance 변수 b :" +b);  접근 불가. 

	}


	public static void main(String[] args) {
		System.out.println("class 변수 a :" +a); // new쓰지 않앗는데 a는 메모리 상 올라가잇다. 
		System.out.println("class 변수 a :" +Test3.a);

		//write(); 인스턴스 메소드-불가 
		print();
		Test3.print();

		Test3 ob =new Test3(); // instance 변수/메소드를 메모리 상에 올리는 것 - new 

		System.out.println("instance 변수 b :" +ob.b); 
		ob.write();
		System.out.println("class 변수 a :" +ob.a);
		ob.print();
		// 경고문이 뜨는 이유 클래스 이름을 붙이지 않고  ob 를 붙였기 때문. 

// 2. 객체가 천 번 생성되더라도 메모리 공간은 (처음 만든 공간)"하나"만 사용한다 (검증)

		System.out.println("--------------------------"); 
		System.out.println("class 변수 Test3.a :"  +ob.a); 
		System.out.println("instance 변수 b :" +ob.b);

		Test3 ob1=new Test3();

		ob1.a=100;
		ob1.b=200;

		System.out.println("class 변수 Test3.a:"  +ob1.a); 
		System.out.println("instance 변수 b :" +ob1.b);

		Test3 ob2=new Test3();

		ob2.a=1000;
		ob2.b=300;

		System.out.println("class 변수 Test3.a:"  +ob2.a); 
		System.out.println("instance 변수 b :" +ob2.b);
		
		System.out.println("--------------------------"); 
// 메모리는 하나의 공간을 사용하기 때문에 1000값만 출력됨 
		System.out.println("class 변수 Test3.a:"  +ob.a); 
		System.out.println("class 변수 Test3.a:"  +ob1.a); 
		System.out.println("class 변수 Test3.a:"  +ob2.a); 

	}

}

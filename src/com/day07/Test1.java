package com.day07;

class Subclass{
	int a,b;
	
	//메소드 만드는 것은 선택사항 
	//instance 변수 자동 0초기화 // new 로 불러올 경우 초기화되는것이라.. 

}


public class Test1 {

	public static void main(String[] args) {
	Subclass ob1 =new Subclass();
	Subclass ob2 =new Subclass();

	System.out.println("ob1.a:"+ob1.a);
	System.out.println("ob1.b:"+ob1.b);
	
	ob1.a=10;
	ob1.b=20;

	System.out.println("ob1.a:"+ob1.a);
	System.out.println("ob1.b:"+ob1.b);
	
	ob2.a=100;
	ob2.b=200;
	

	System.out.println("ob2.a:"+ob2.a);
	System.out.println("ob2.b:"+ob2.b);
	

	System.out.println("ob1.a:"+ob1.a);
	System.out.println("ob1.b:"+ob1.b);
	
	
	
		
	}

}

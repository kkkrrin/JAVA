package com.day08;

import java.util.Calendar;

//Call by value
//-> Stack 영역에서 Heap 영역으로 데이터 자체가 넘어가는 것. 
//Call by Reference
//-> Heap 영역에서 Stack 영역으로 주소가 넘어간다. (데이터가 아닌 주소)

class Test{
	public int x=10;
	
	public void sub(int a){
		x+=a; 
	}
}
public class Test7 {
	public static void main(String[] args) {
		Test ob= new Test();
		int a=10; 
		//call by value 
		System.out.println("sub()메소드 실행 전 x 값:"+ob.x); //10
		ob.sub(a);
		System.out.println("sub()메소드 실행 후 x 값:"+ob.x); //20
		
		//call by reference 
		Test ob1 ; // 클래스의 초기값은  null ( 주소 받을 대기중 ) 
		
		ob1=ob; // 같은 곳을 가리키고 있다. 
		
		System.out.println(ob.x);//20
		System.out.println(ob.x);//20
	
		ob1.x=100; // 같은 곳을 가리키고 있기때문에 같은 값이 나온다. 
		System.out.println(ob.x);//100
		System.out.println(ob.x);//100
	
		//static calender  static 은 하나만 생성되기 때문에 c2,c3는 주소를 받아서 보는 것. 
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		Calendar c3 = Calendar.getInstance();

	}
}

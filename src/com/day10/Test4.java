package com.day10;
//Wrapper class // 자료형의 앞글자를 대문자.. 클래스로 만들어서 사용하는 것. 
//래퍼런스 자료형 - 주소참조 (= 클래스 자료형 같은 느낌)
//Boolean, Byte, Character,Short, Integer, Long , Float, Double  같은 형식의 클래스를 만들어 메소드를 만들고 ...
// 래퍼런스/ 클래스 = 힙영역,일반 자료형은 스택에 저장됨. 
//Auto-Boxing : stack -> Heap  자료형 ->클래스 넘길 수 있다. 
//Auto-unBoxing : heap -> Stack 

public class Test4 {

	public static void main(String[] args) {
		
		int n1 = 10;  //stack 
		int n2 ;
		Integer num1; //heap
		Integer num2 = new Integer(20);
		
		num1 = n1; //Auto- Boxing
		n2= num2; // Auto-unBoxing
		System.out.println(n1+":"+num1); //10:10
		System.out.println(n2+":"+num2); //20:20
		
	}
}

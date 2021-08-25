package com.day11;

import java.io.ObjectInputStream.GetField;

//4. 내부클래스 ( 익명의 클래스 Anonymous class ) 

public class Test8 {
	
	public Object getTitle() {
		
		return new Object() {
			
			@Override
			public String toString() {
				return "익명의 클래스";
			}	
		};
		
		//return 30; //upcast  object 를 통해 나가는 .. 뭐 그런 (object 가 대장이라) 
	}

	public static void main(String[] args) {
		
		Test8 ob = new Test8();
		System.out.println(ob.getTitle());
		
	}

}

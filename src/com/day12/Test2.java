package com.day12;

import java.util.Iterator;
import java.util.Vector;

public class Test2 {
	
	private static final String city []= {"서울","부산","대구","인천","광주","대전","울산"};
// 메인문 안에 쓰면 static 2개라 오류남 

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>(); 		//< 데이터타입> 을 넣어준다.
	//	Vector<String> v = new Vector<>(); 	 생략 가능 
		
		for( String s : city) {
			v.add(s);
			
		}
		
		String  str;
		str=v.firstElement() ; // index 0 번째 가져옴 get 써도됨. 
		System.out.println(str);
		
		str=v.get(1);
		System.out.println(str);
		
		str=v.get(2);
		System.out.println(str);
		
		for (int i=0; i<v.size();i++) { // vector 는 v.length아니고 size. 
			System.out.print(v.get(i)+" ");
			
		}
		System.out.println("\n---------------------------------------------");
		
		for(String s: v) { // 확장 for 문. 
			System.out.print(s+" ");
		}
		
		System.out.println("\n---------------------------------------------");
		
		Iterator<String> it= v.iterator(); // 데이터를 많이 받는 경우 iterator 를 사용해서 데이터 꺼내는게 빠르고 좋다. 
		while(it.hasNext()) { // 커서를 내리는 역할 
			String s = it.next();
			System.out.print(s+" ");
		}
		
	}

}

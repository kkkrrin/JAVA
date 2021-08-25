package com.day12;
//Collections Framework ( 방법) 
// 자료를 저장하기 위한 컬렉션이며, 인터페이스 이다. (List, Map) 
// 이 인터페이스를 구현한 클래스가 있으며,  그 종류가 
// Vector, ArrayList, HashSet, TreeSet, HashTable 가 있다. 
// 배열이랑 똑같은데, 배열의 단점을 보완한 것. 
// List(I)- Vector(C),ArrayList(C)
//Map(I) - HashSet(C),HashTable(C) 

import java.util.Iterator;
import java.util.Vector;

public class Test1 {

	private static final String city []= {"서울","부산","대구","인천","광주","대전","울산"};

	public static void main(String[] args) {

		Vector v = new Vector()	;   //데이터타입 : object 
		//Vector<E> E 나중에 설명해주시니 지워도됨. 
		// 사용자한테 받을 데이터가 정해지지 않은경우 object 로 선언? 받을준비 한다.  ( 대장 )

		v.add("서울"); // 배열로 저장된것,. 
		v.add(30);
		v.add('c'); //upcast.

		String str;
		str=(String)v.get(0); //error - downcast 해줘야함. str- string v-object(부모)니깐 다운캐스트 
		System.out.println(str);

		Integer i;
		i=(int)v.get(1); // Auto-Boxing (stack->heap) 그냥 알아만 두기. 
		System.out.println(i);

		char c;
		c=(char)v.get(2);
		System.out.println(c);

		Iterator it = v.iterator(); //반복자 v에 잇는 내용 꺼내서 it 에 저장. 
		while(it.hasNext()) { // hasNext() 데이터가 있을 때 까지 반복문 돌리기. 
			Object o = it.next(); // 하나씩 꺼내온다. ( v 값 데이터 타입이 하나가 아니니까 obj 로 받아?) 

			if(o instanceof String) { // 원래 데이터타입 물어보는 것 instanceof
				str=(String)o;
				System.out.println(str);
			}else if(o instanceof Integer ) {
				i=(int)o;
				System.out.println(i);
			}else if(o instanceof Character) {
				c=(char)o;
				System.out.println(c);
			}
		}
		
		
		
	}

}

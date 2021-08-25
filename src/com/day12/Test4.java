package com.day12;
//ArrayList<>

import java.util.ArrayList;
import java.util.Vector;

class Test{
	String name;
	int age;
}

public class Test4 {

	public static void main(String[] args) {
		//Vector<String> v= new Vector<String>();  arraylist 를 더 많이 쓴다. 
		ArrayList<Test> list = new ArrayList<Test>(); // 배열안에 클래스 넣기 ( Record score 랑 같음)
		
		Test ob = new Test();
		ob.name="yerinlee";
		ob.age=25;
		list.add(ob); //데이터 넣기
		
		//Test ob1=new Test();
		ob =new Test();  //주소를 가리켜서 찾아가기 때문에 ob에 저장해도 상관 없음. 
		
		ob.name="seungmin";
		ob.age=25;
		list.add(ob);
		
		for(Test t:list) {
			System.out.println(t.name+":"+t.age);
		}
		
		
	}

}

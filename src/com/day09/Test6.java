package com.day09;
//String 
// 자료형이 아닌 클래스이다. 
//사용빈도가 아주 많고,저장할 데이터는 크기 때문에 자료형처럼 쉽게 사용하고
//데이터는 heap영역에 저장한다. 
//불변의 법칙 : 한번 데이터를 넣으면 바뀌지 않는다. 
// String은 equals 로 비교한다. 

public class Test6 {

	public static void main(String[] args) {
		
		String ob1 ="Seoul";
		String ob2 ="Seoul";
		// call by reference : 같은모양의 경우 주소는 같다. 
		// 안에 내용을 바꿔주면 주소가 달라진다. 
		
		String ob3 = new String("Seoul");  // 클래스니깐 이렇게 선언가능. 

		
		//주소비교 
		System.out.println("ob1==ob2: "+(ob1==ob2)); // true
		System.out.println("ob1==ob3: "+(ob1==ob3));// flase 
		System.out.println("ob1.equals(ob3):" + ob1.equals(ob3)); //true
		
		//override돼있어서 결과값이 저렇게 나온다.
		
		ob2="korea";
		System.out.println("ob1==ob2: "+(ob1==ob2)); // flase

		ob2="british";
		System.out.println("ob1==ob2: "+(ob1==ob2)); // flase

		ob2="Seoul";
		System.out.println("ob1==ob2: "+(ob1==ob2)); // true

		// 덮어쓰다보면 고아데이터가 생성됨. 
		
		
	}

}

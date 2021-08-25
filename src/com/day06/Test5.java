package com.day06;

public class Test5 {

	public static void main(String[] args) {
		Rect ob1= new Rect(); //생성자
		//Rect에서 ob1 이름으로 복사하기
		
		ob1.input(); // 메소드 호출
		int a = ob1.area(); // int를 반환하는 메소드기 때문에 int a 변수를 생성해 받는다. 
		int l =ob1.length();
		ob1.print(a, l);
		
		Rect ob2 =new Rect();
		ob2.input();
		a=ob1.area();
		l=ob2.length();
		ob2.print(a, l);
		
		Hap ob3 =new Hap(); // 클래스 안에 클래스를 만든 경우 외부에 있는 class 불러다 사용가능하다. 
											//같은 패키지 안에서만 가능하다. 
		ob3.input();
		int i=ob3.cnt();
		ob3.print(i);
		
	}

}

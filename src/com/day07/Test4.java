package com.day07;

import java.util.Calendar;

public class Test4 {

	public static void main(String[] args) {
		//MyData my= new MyData(); 메모리 상에 올라간 애들은 객체를 생성할 필요 없다.
		//my.print();
		
		//메모리 할당이 이루어지며 [클래스 이름.객체이름] 으로 접한다.
		MyData.getInstance(); // 클래스 메소드 접근 방식.

		Calendar c1= Calendar.getInstance(); // 이미 존재하는 캘린더 클래스 
		Calendar c2= Calendar.getInstance();
		
	}

}

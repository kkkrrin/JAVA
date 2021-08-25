package com.day05;

import com.day06.Rect;

public class Test7 {

	public static void main(String[] args) {
		Rect ob=new Rect(); // 다른 패키지에서 가져 올 수 있고,import 된다. 
		ob.input();
		int area= ob.area();
		int length=ob.length();
		ob.print(area, length);
		
	}

}

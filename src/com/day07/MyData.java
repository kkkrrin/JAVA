package com.day07;

public class MyData {

	static String name ="배수지";
	static int age =28; 

	public static void getInstance() { // static 쓰려면 위 변수도static 으로 메모리상에 올려준다. 
		System.out.println(name + " 나이는"+age +" 살 ");
	}
}

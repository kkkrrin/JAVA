package com.day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("클래스명 [java.lang.String] : ");
		String str= sc.next();

		Class cls=Class.forName(str);

		// 생성자.
		Constructor[] c= cls.getConstructors();
		System.out.println("생성자...");

		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}

		System.out.println("-------------------------");

		//필드 
		Field[] f= cls.getFields();
		System.out.println(" 필드.. ");

		for(int i=0; i<f.length; i++) {
			System.out.println(f[i]);
		}

		System.out.println("-------------------------");
	
		//메소드
		Method[] m= cls.getMethods();
		System.out.println("메소드...");

		for(int i=0; i<m.length; i++) {
			System.out.println(m[i]);
		}

	}
}

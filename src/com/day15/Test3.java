package com.day15;
//InputStreamReader

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test3 {

	public static void main(String[] args) throws IOException{
		
		int data;
		System.out.print("문자열 입력 : ");
		
		Reader  rd =new InputStreamReader(System.in); //2바이트의 문자로 변형 .( 브릿지 클래스 라고도함) 
		
		while((data=rd.read())!=-1) {
			char ch= (char)data;
			System.out.print(ch);
		}
		
		
		
	}

}

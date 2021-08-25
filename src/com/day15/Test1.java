package com.day15;

import java.io.IOException;

//Stream 입출력시 데이터가 흐르는 경로(관?)

// 기본 입출력 : read 

public class Test1 {

	public static void main(String[] args) throws IOException{
		
		int data;
		System.out.print(" 문자열 입력 : ");
		while((data=System.in.read()) != -1) { // 데이터가 없지않을 때 까지 - 있을 동안. 
			char ch= (char)data;
			System.out.print(ch);
		}

	}

}

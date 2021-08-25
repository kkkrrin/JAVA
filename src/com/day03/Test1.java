package com.day03;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		
		
		//char ch='a';
		char ch;
		char result;
		
		//System.out.println(ch);
		//System.out.println(Integer.toString(ch));
		
		System.out.print("한  개의 문자를 입력하시오 : ");
		ch = (char)System.in.read(); //1바이트 씩 읽어오는 것.
		//bufferedreader 는  string 이라 char 자료형이 안맞아서 안됨.
		//System.in.read()는 int 를 반환한다 그래서 형변환필요
		
		
		result = ch>='A'&&ch<='Z'?(char)(ch+32):(ch>='a'&&ch<='z'?(char)(ch-32):ch);
		//동일 =result = ch>=65&&ch<=90?(char)(ch+32):(ch>=97&&ch<=122?(char)(ch-32):c
		
		//자바의 char형은 수or문자를 알아서 바꿔줌
		//조건식에서 "더했기때문에" int형이 되므로 char로 형변환해야함.
		
		System.out.println(ch+"->"+result);
		
		
		
		
	}

}

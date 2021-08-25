package com.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//java.util.regex 라는 패키지는 정규화표현식을 다루는 클래스이다.
/*
 c[a-z]* : c 로 시작하는 영단어 
 c[a-z]   : c 로 시작하는 두 글자 영단어 
 c[a-zA-Z0-9]   : ca,cK,c9
 c. : c&,cB,c9
 c.*: c로 시작하는 모든 문자
 c.*t :ct,chhhht,c7777t
 [b|c]].* , [bc].* , [b-z].* : b로 시작하는 문자, c로 시작하거나..
 [\\d] , [0-9]+ : 하나 이상의 숫자 
 */

public class Test3 {

	public static void main(String[] args) {
		
		String  str [] = {"bat","baby","bonus","c","cA","ca","c.","c0","car","combat","count","date","disc"};
		
		Pattern p; 
		p=Pattern.compile("c[a-z]*"); // 패턴 정의
		
		for(String s: str) {
			Matcher m= p.matcher(s);
			
			if(m.matches())
				System.out.println(s);
		}
		
		System.out.println("---------------");
		p=Pattern.compile("c[a-z]+"); // 패턴 정의
		
		for(String s: str) {
			Matcher m= p.matcher(s);
			
			if(m.matches())
				System.out.println(s);
		}
		
		//메일 확인
		String[] mail= {"aaaa@aaa.com","@aaa.co.kr",".@bbb.com","aaa@vvv.co.kr","ggg.co.kr","abc@abc"};
		
		//[\\w]+ : 한글자 이상의 영숫자.
		//@
		//(\\.[\\w]+) : ()안에 있는 것은 반드시 한번은 와야한다. 
		
		String pat ="[\\w]+@[\\w]+(\\.[\\w]+)+";
		
		for(String s : mail) {
			if(Pattern.matches(pat, s)) {
				System.out.println(s);
				
			}
		}
		
		
	}

}

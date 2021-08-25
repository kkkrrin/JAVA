package com.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

	public static String replaceAll(String str, String oldStr, String newStr) {
		
		if(str ==null)
			return null;
		Pattern p= Pattern.compile(oldStr);
		Matcher m=p.matcher(str);;
		
		StringBuffer sb= new StringBuffer();
		
		while(m.find()) {
			m.appendReplacement(sb, newStr);		
		}	
		m.appendTail(sb); // 다 출력하도록 ( 꼬리자르지않도록) 
		return sb.toString();	
	}
	
	public static void main(String[] args) {
		
		String str = "우리나라 대한민국 대한민국 대한의 어쩌구..";
		String s =Test4.replaceAll(str, "대한민국", "KOREA");
		System.out.println(s);	
		
	}
}

package com.day10;
//string buffer 사용 


public class Test1 {

	public static void main(String[] args) {
		
		StringBuffer sb =new StringBuffer();
		sb.append("서울");
		sb.append("부산 ");
		System.out.println(sb);
		
		//  위 아래 결과는 같이 나온다. 
		
		String str = sb.toString();
		System.out.println(str);
		
		//Integer ( 클래스 ) =>( int 자료형 (스택에 저장 ) 
		
		int  a = 24;
		System.out.println(a);
		
		//부모가 가진 거 오버라이드 한 것.    
		System.out.println(Integer.toString(a));// 24
		System.out.println(Integer.toString(a,2)) ;//11000
		System.out.println(Integer.toString(a,16)) ;//18
		
	
	
	}

}

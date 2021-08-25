package com.day10;

//String 의 메소드.  ( 자주 쓰이는 것 ) 

public class Test2 {

	public static void main(String[] args) {
		
		String s1= "서울, 부산, 대구 ";
		String ss[]=s1.split(","); // s1의 값을 쉼표로 구분해서 ss 배열에 저장. (무조건 쉼표?)
		
		for(String s: ss) { //ss를 읽어와서 s에 하나씩 저장. 
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		String s2="seoul";
		String s3="Seoul";
		
		System.out.println(s2.equals(s3));  //false
		System.out.println(s2.equalsIgnoreCase(s3)); //true 대소문자 가리지 않고 비교하는 것. 
		
		// index 생성 됨.0123456789-> 첫번째 . 만나서 출력 
		String s4= "abc.def.hij";
		System.out.println(s4.indexOf(".")); //3
		System.out.println(s4.lastIndexOf("."));//7
		System.out.println(s4.indexOf("def"));//4
		System.out.println(s4.indexOf("x"));//-1 존재하지 않는 것. 
		
		String s5= "우리나라 대한민국 좋은나라 대한민국";
		String s6 =s5.replaceAll("대한", "한자 "); //치환 
		System.out.println(s6);
		
		String s7 ="  a  b  c  "; // 두칸씩 
		System.out.println(s7);
		System.out.println(s7.trim()); // 앞 뒤공백없애기 // a b c
		System.out.println(s7.replaceAll("   ", " "));
		System.out.println(s7.replaceAll("\\s"," "));
		
		
		char ch="abcdefg".charAt(2); // 인덱스 2번째 꺼.  ( char 자료형 확인) 
		System.out.println(ch);
		System.out.println("abcdefg".startsWith("abc")); //true 시작하는 문자 확인. 
		System.out.println("abcde gf".length()); //8
		
		//사전 정렬 
		String s8 = "abcdefg";
		String s9 = "abcbdef";
		System.out.println(s8.compareTo(s9));
		System.out.println(s9.compareTo(s8)); // 아스키코드 값 비교 
		
	
		
		
		
		
	}

}

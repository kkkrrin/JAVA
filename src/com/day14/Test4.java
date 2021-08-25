package com.day14;

import java.util.Scanner;

class MyExceptionA{

	public void inputFormat(String str) throws Exception{

		// 5~10자 이내의 문자인지 검사
		// 영문자만 입력
		// error :  문자열의 길이는 5~10 자 입니다.
		// error : 영문자만 입력 가능합니다. 

		if(str.length()<5||str.length()>10) {
			throw new Exception("문자열의 길이는 5~10자 입니다.");	// 에러 발생시키
		}

		int eng =0;
		int num=0;
		//카운트 용
		
		for(int i=0;i<str.length();i++) {
			// 문자열에서하나 씩 빼와서 비교해야됨.
			char ch =str.charAt(i);
			
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) { //영문 
				eng++;
			}else if(ch>='0'&&ch<='9') { // 숫자
				num++;
			}
		}
		
		if(eng==0||num==0)
			throw new Exception("영문자,숫자 혼용해서 입력해야합니다.");
	}
}


public class Test4 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String str;

		MyExceptionA auth = new MyExceptionA(); // 객체 생성

		try {

			System.out.print("문자열(영문자+숫자) 입력하세요 : "); //abcd
			str= sc.next();

			auth.inputFormat(str);
			
			System.out.println(str);

		} catch (Exception e) { // 에러메세지가 들어오는 곳. 
			System.out.println(e.toString()); // toString () -> 문자열로 출력할 것을 명시하기 위해 오버라이드해서사용한다.
		}

	}

}






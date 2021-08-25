package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthenMain {

	public static void main(String[] args)  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		double num1, num2, result;

		OperAuthen auth = new OperAuthen();

		try {

			System.out.print("두 개의 정수 입력 [a,b]");

			str = br.readLine();
			auth.inputFormat(str);
			
			String tmp []= str.split(","); // 실제 데이터 구분하는 작업. 
			auth.number(tmp[0]);
			num1= Double.parseDouble(tmp[0]);
			
			auth.number(tmp[1]);
			num2= Double.parseDouble(tmp[1]);
			
			System.out.print("연산자 입력하세요 :");
			str= br.readLine();
			auth.operator(str.charAt(0)); // 첫번째 꺼 읽어온다.
			
			char ch = str.charAt(0);
			result =0;
			if(ch=='+')
				result = num1 + num2;
			else if(ch=='-')
				result = num1-num2;
			else if(ch=='*')
				result = num1*num2;
			else if(ch=='/')
				result = num1/num2;
			
			System.out.printf("%.1f%c %.1f =%.1f\n",num1,ch,num2,result);
			
	
		} catch (IOException e) {  // readLine() 의 오류를 잡는 거? (원래 상단에 표시하는거) 
			System.out.println(e.toString());
		}
		catch(AuthenException e) {
			System.out.println(e.toString());
		}



	}

}

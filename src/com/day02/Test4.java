package com.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2 ;
		System.out.print("첫번째 수 입력:");
		num1=Integer.parseInt(br.readLine()); // Integer = 클래스, int = 자료형 자료형은 명령어를 만들 수 없음. 그래서 클래스를 만들었디?
		
		System.out.print("두번째 수 입력:");
		num2= Integer.parseInt(br.readLine());
		
		System.out.printf("result=%d+%d=%d\t",num1,num2,num1+num2);
		System.out.printf("result=%d-%d=%d\n",num1,num2,num1-num2);
		System.out.printf("result=%d*%d=%d10\t",num1,num2,num1*num2);
		System.out.printf("result=%d/%d=%d\n",num1,num2,num1/num2);
		System.out.printf("result=%d%%%d=%d\n",num1,num2,num1%num2);
		System.out.println("num1>num2:" + (num1 > num2)); // 자바 부등호 인식을 위해 괄호 필수.
	
		String str1,str2,str3; 
		// 삼항연산자. (조건? 값1 : 값2)
		str1= num1%2==0?"짝수":"홀수";
		System.out.println(str1);
		
		str2= num1>0?"양수":(num1<0?"음수":"0"); // 조건 하나 더 쓸 수 있음. 
		System.out.println(str2);
		
		//윤년 구하는 공식 2000년도 나누기 
		str3 = num1%4 ==0 && num1%100!=0 ||num1%400==0?"윤년":"평년";
		System.out.println(str3);
		
		//    and = &&, or = || 
		
		
	}
}

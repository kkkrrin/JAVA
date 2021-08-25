package com.day08;

import java.io.IOException;
import java.util.Scanner;

// 계산기 
//boolean

class Calc{
	private int num1,num2;
	private char oper;

	public boolean input() throws IOException{
		Scanner sc =new Scanner(System.in);

		System.out.print("두개의 수를 입력하세요 : ");
		num1= sc.nextInt();
		num2= sc.nextInt();

		System.out.print("연산자 : ");
		oper =(char)System.in.read();// 정수값 읽어오기 때문에 형변환. 

		//연산자 확인
		if (oper!='+'&&oper!='-'&&oper!='*'&&oper!='/') {// 양쪽이 부정이면(~이거나) ||->&&바꾼다.
			return false;
		}
		return true;
	}

	public int result() {
		int r = 0; //결과

		switch(oper) {
		case '+' :
			r=num1+num2;
			break;
		case '-' :
			r=num1-num2;
			break;
		case '*' :
			r=num1*num2;
			break;
		case '/' :	
			r=num1/num2;
			break;
		}
		return r; 
	}

	public void print(int r) {
		System.out.printf("%d %c %d : %d",num1,oper,num2,r);
	}

}

public class Test6 {
	public static void main(String[] args) throws IOException{
		Calc ob =new Calc();
		//ob.input();  // input 메소드에서 예외처리 해줬으니 메인문에서도해줘야 한다. 
		//boolean flag =ob.input();
		// true = 실행, false =중지

		if(!ob.input()) { //간단하게 입력 가능. 
			return;	
		}
		int r= ob.result();
		ob.print(r);
	}
}

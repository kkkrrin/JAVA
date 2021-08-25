package com.day04;

import java.io.IOException;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char oper;
	
		System.out.print("첫 번째 수 : ");
		num1=sc.nextInt();
		System.out.print("두번 째 수 :");
		num2=sc.nextInt();
		
		System.out.print("연산자[+.-,*,/]?"); //string은 공백까지 처리해주기 때문에 char 을쓴다.
		oper=(char)System.in.read();
		
		switch(oper) {
		
		case '+':
			System.out.println(num1 + num2 );
			break;
		
		case '-':
			System.out.println(num1 - num2 );
			break;
			
		case '*':
			System.out.println(num1 * num2 );
			break;
		case '/':
			System.out.println(num1 / num2 );
			break;
		default:
			System.out.println("wrong!");
			break;
			
		}
		sc.close();
	}

}

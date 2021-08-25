package com.day03;

import java.util.Scanner;

public class Test4{

	public static void main(String[] args) {

		int num;
		//String str;
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력: ");		
		num = sc.nextInt();
		
		if(num%3==0) {
			System.out.printf("%d 는 3의 배수이다. ",num);
			//str = "3의 배수다.";
		}
		if(num%4==0) {
			System.out.printf("%d 는 4의 배수이다.",num);
			//str= "4의 배수다.";
		}
		
		else if(num%3!=0&&num%4!=0) {
			System.out.printf("%d는 움~ 3,4의 배수가 아니다.",num);
		}
		
		//  system.out.println(str);
		sc.close();
		
	}

}

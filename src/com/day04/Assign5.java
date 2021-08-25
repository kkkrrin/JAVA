package com.day04;

import java.util.Scanner;

public class Assign5 {

	public static void main(String[] args) {
		
		int num1, num2;
		int sum=0;
	
	
		Scanner sc =new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		for( int i=num1;i<=num2;i++) {
			sum=sum+i;
			
		}
		System.out.print("두 수의 사이 합 : "+sum);

		sc.close();
		
	}

}

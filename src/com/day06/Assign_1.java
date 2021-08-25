package com.day06;

import java.util.Scanner;

public class Assign_1 {
	// 클래스에서 	 연산, 입력, 출력 의 역할을 만든다.

	int num1,num2;

	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하시오 : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}

	public int work() {
		int sum=0; // 지역변수로 선언했기 때문에 초기화 작업
		for(int i=num1;i<=num2; i++) {
			sum=sum+i;
		}
		return sum;
	}

	public void print(int a) {
	
		System.out.printf("%d 부터 %d 까지의 합 : %d",num1,num2,a);	
		
	}

}



package com.day06;

import java.util.Scanner;

// 클래스 안에 클래스 만들기, 하나의 파일에는 한개의 public class를 갖는다. 
//그래서 새로운 클래스 만들때 public쓰면 안된다.

class Work{
	int num1,num2;
	public void intput() {
		Scanner sc =new Scanner(System.in);
		System.out.print("두 정수를 입력하세요 ");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}

	public int result() {
		int sum=0;
		for(int i=num1; i<=num2;i+=2) {
			sum=sum+i;
		}
		return sum;
	}

	public void print(int add) {
		System.out.printf("%d 부터 %d 까지의 홀수의 합 : %d",num1,num2,add);

	}

}

public class Assign2 {
	public static void main(String[] args) {
		Work addresult =new Work();
		addresult.intput();
		int add=addresult.result();
		addresult.print(add);
	}

}

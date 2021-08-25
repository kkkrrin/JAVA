package com.day03;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 세 개의 수를 입력 받아 작은 수에서 큰 수 순으로 출력
		
		
		int n1,n2,n3;
		int tmp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("세 개 숫자 입력:");
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		
		if(n1>n2) {
			tmp= n1; 
			n1=n2;
			n2=tmp;
		}
		if (n1>n3) {
			tmp=n1;
			n1=n3;
			n3=tmp;
		}
		if(n2>n3) {
			tmp=n2;
			n2=n3;
			n3=tmp;
		}
		
		
		System.out.printf("%d,%d,%d",n1,n2,n3);
		//System.out.println(n1 + " " + n2 + " "+ n3);
		
		sc.close();

	}

}

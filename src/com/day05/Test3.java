package com.day05;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int num[]=new int[5];

		Scanner sc=new Scanner(System.in);

		System.out.print(" 5개의 정수를 입력하세요 : ");

		for(int i=0; i<num.length;i++) {
			num[i]=sc.nextInt();
		}

		int i,j,tmp;

		System.out.print("Source data : ");


		for (i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}

		System.out.println();

		//정렬 (Selection sort)

		for (i=0;i<num.length-1;i++) {
			for (j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}

		//확장 for 문 
		System.out.print("Sorted data : ");
		for (int su : num) {
			System.out.printf("%4d",su);
		}

		System.out.println();
		sc.close();
	}
}

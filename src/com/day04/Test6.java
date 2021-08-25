package com.day04;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		//배열 
	
//		int num[]=new int[5];
//		num= new int[] {10,20,30,40,50};
		
		Scanner sc= new Scanner(System.in);
		
		int num[]=new int[5];
		
		System.out.print("5개 정수 입력 :");
		
//		num[0]=sc.nextInt();
//		num[1]=sc.nextInt();
//		num[2]=sc.nextInt();
//		num[3]=sc.nextInt();
//		num[4]=sc.nextInt();
		
		for(int i=0; i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
//		System.out.println("배열의 개수:"+num.length);
//		System.out.println("num[0]:"+num[0]);
//		System.out.println("num[1]:"+num[1]);
//	    System.out.println("num[2]:"+num[2]);
//		System.out.println("num[3]:"+num[3]);

		for(int i=0; i<num.length;i++) {
			System.out.println("num"+i+"="+num[i]);
			
		}
		
		
		sc.close();
		
		
	}

}

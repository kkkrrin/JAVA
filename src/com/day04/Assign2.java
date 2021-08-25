package com.day04;

public class Assign2 {

	public static void main(String[] args) {
		
		int num=0;
		
		for ( int i=1;i<=100;i+=2) {
			num=num+i;
		}
		System.out.println("홀수의 합 :"+num);

		num=0;
		
		for (int i=0;i<=100;i+=2) {
			num=num+i;
		}
		System.out.println("짝수의 합 :"+num);
		
		num=0;
		for( int i=1;i<=100;i++) {
			num=num+i;
		}
		System.out.println("전체의 합 :"+num);

	}
	
		
}

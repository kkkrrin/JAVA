package com.day04;

public class Assign1 {

	public static void main(String[] args) {	

		int i;
		int sum=0;	
		for(i=1; i<=10;i++) {
			for(int j=1;j<=i;j++) {	
				sum=sum+j;
			}
		}
		System.out.print(sum);


	}
}

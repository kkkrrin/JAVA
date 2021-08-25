package com.day04;

public class Assign3 {

	public static void main(String[] args) {

		int sum=0;
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum=sum-i;
			}else 
				sum=sum+i;
		}
		
		System.out.print(sum);
		
	}

}

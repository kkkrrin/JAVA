package com.day06;

public class Test1 {

	public static void main(String[] args) {
		//Bubble sort 

		int num[]= {29,65,7,4,10};
		int i,j,tmp;

		System.out.println("Sorce Data: ");
		for(i =0 ; i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}

		System.out.println();

		//		Bubble sort 
		for(i=1;i<num.length;i++) {
			for(j=0;j<num.length-i;j++) {
				//System.out.println(i+":"+j);	
				if(num[j]>num[j+1]) {
					tmp=num[j];
					num[j]=num[j+1];
					num[j+1]=tmp;
				}
			}
		}
		System.out.println("Sorce Data: ");
		for(i =0 ; i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
	}
}

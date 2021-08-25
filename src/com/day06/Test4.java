package com.day06;

public class Test4 {

	public static void main(String[] args) {
		//2차원배열의 합 구하기. 

		int a[][]= {{5,4,3},{2,3,4},{7,4,3}};
		int d[][]= {{7,6,4},{3,2,3},{8,7,7}};
		int sum[][]=new int[3][3];
		int i,j;

		for(i=0;i<a.length;i++) {
			for(j=0;j<d.length;j++) {
				sum[i][j] = a[i][j]+d[i][j];
				System.out.printf("%4d",sum[i][j]);
			}
			System.out.println();	
		}
	}
}

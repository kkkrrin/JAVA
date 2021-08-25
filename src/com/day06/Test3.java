package com.day06;

public class Test3 {

	public static void main(String[] args) {
		// 배열의 배열 (다차원 배열) 

		int arr [][]=new int [6][6];
		int i,j;
		int n;
		n=0;

		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				n++;
				arr[i][j]=n;				
				arr[i][5]+=n;// 가로  합 
				arr[5][j]+=n;// 세로 합 
				arr[5][5]+=n;// 총 합 
			}
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

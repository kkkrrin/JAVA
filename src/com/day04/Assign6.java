package com.day04;

public class Assign6 {

	public static void main(String[] args) {
		
		//구구단 옆으로 출력 
	
//		for (i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d=%d\n",i,j,(i*j));
//				
//			}
//		}


		for (int i=2; i<=9;i++) {
			System.out.printf("%d단\t",i);
		}
		System.out.println();
		for(int i=1;i<=9;i++) {
			for(int j=2; j<=9;j++) {
				System.out.printf("%d x %d= %d \t",i,j,(i*j));
			}
			System.out.println();
		}

		
	}

}

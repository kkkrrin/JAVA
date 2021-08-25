package com.day04;

public class Test4 {

	public static void main(String[] args) {
		//butterfly * 
		int i,j;
		
	/*	for (i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
				
			}
				
			System.out.println();
		}
		
		for (i=5;i>=1;i--) {
			for(j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
				
			}
				
			System.out.println();
		}
		
	*/
		// * 다이아몬드 
		for (i=5;i>=1;i--) {
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
				
			}
				
			System.out.println();
		}
		 
		//삼각형
		
		for (i=2;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
				
		}
				
			System.out.println();
		}
		
		//역삼각형
//		for (i=5;i>=1;i--) {
//			for(j=1;j<=5-i;j++) {
//				System.out.print(" ");
//			}
//			for(j=1;j<=i*2-1;j++) {
//				System.out.print("*");
//				
//			}
//				
//			System.out.println();
//		}
//		

	}

}

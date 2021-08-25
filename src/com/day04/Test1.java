package com.day04;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//구구단
		
		//for 시작과 끝이 명확한 경우 
		Scanner sc = new Scanner(System.in);
		
		int dan=0;
		int result=0;
		System.out.print(" 단 입럭: ");
		dan = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			result=dan*i;
			
			//System.out.println(dan+"x"+i+"="+ (dan*i));
			System.out.println(dan+"x"+i+"="+result);
		}
			
		sc.close();
		
		System.out.println("-------------------------------------");

		//while 몇 번 돌려야 될지 모를 때 
		
		int j=1;
		while(j<10) {
			System.out.printf("%d*%d=%d\n",dan,j,(dan*j));
			j++;	
		}
		
		
		System.out.println("-------------------------------------");
		
		//do-while (조건(최대값)); 물어볼때. 
		
		/*do {
			
		}while();
		*/
		int k=0;
		
		do {
			k++;
			System.out.printf("%d*%d=%d\n",dan,k,(dan*k));
			
		}while(k<9);
					
	}
	
}

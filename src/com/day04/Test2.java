package com.day04;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException{
		
		
		Scanner sc = new Scanner(System.in);
		
		int su, sum=0; 
		char ch;
	
		
		while (true) {
	//		sum=sum+su;
			do {
				System.out.print(" 수 입력 : ");
				su=sc.nextInt();
				//System.out.println(sum);
			}while(su<1||su>5000);
			
			sum=0; // sum 누적되기때문에 초기화 필요함.
			
			for(int i=1;i<=su;i++) {
				sum=sum+i;
				
			}
			System.out.print("1~"+su+"까지의 합:" +sum);
			
			System.out.print("계속 할래 ? [Y/N]");
			
			ch=(char)System.in.read();
			// ch 문자형이기때문에 char 형변환, 1바이트 반환해주는 sys.in.read 사용 
			
			if(ch!='y'&&ch!='Y') {// 조건 양쪽이 부정일 경우 || 가 아니라 && 사용해야함!
				System.out.println("종료");
				break;// 반복문 나오기 for, while, do-while, switch 	
			}
		}	sc.close();
	}
}

package com.day05;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args)throws IOException {

		Scanner sc= new Scanner(System.in);

		int num,rand;
		int cnt = 0;
		char ch;

		Random rd=new Random();
		rand = rd.nextInt(10)+1;

		while(true){
			cnt=0;
			do {
				++cnt;
				System.out.printf("정수 입력 : [%d번 째 기회]",cnt);
				num=sc.nextInt();
				if ( num!=rand) {
					System.out.println(" wrong!! ");
				}
				if(num==rand){ 
					System.out.println("correct !!");
					break;
				}
			}while(cnt<3);
			
			System.out.printf("\n정답은 : %d 입니다.\n\n",rand);

			System.out.println("계속 할래 ? [Y/N]");
			ch=(char)System.in.read();
			if(ch!='y'&&ch!='Y') {			
				System.out.println("종료");
				break;
			}
		} sc.close();
	}
}

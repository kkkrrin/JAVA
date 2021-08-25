package com.day05;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args)throws IOException{
		//		 1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
		//		  1:가위, 2:바위, 3:보

		Scanner sc=new Scanner(System.in);
		int num,rand;
		int i=0,ch;
		Random rd= new Random();
		rand=rd.nextInt(3)+1;



		//ch=(char)System.in.read();

		while(true) {
			do {
				i++;
				System.out.printf("1 : 가위, 2: 바위, 3:보 :");
				num=sc.nextInt();
				System.out.printf("컴퓨터:%d   사람:%d\n",rand,num);
			}while(i>3);
				
			}
		}
	}

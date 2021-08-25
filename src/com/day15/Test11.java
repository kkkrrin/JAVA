package com.day15;
//발표자 인원 받아서 발표자 받아내기 

import java.util.Random;
import java.util.Scanner;

class MyThread extends Thread{
	
	int cnt =0;
	String str;
	
	public void run() {
		
		while(true) {
			System.out.print(".");
			
			try {
				sleep(100);
				if(cnt==20)
					break;
				cnt++;
			} catch (Exception e) {
				System.out.println(e.toString());
				}
		}
	}
}


public class Test11 {
	
	private static String[] name = 
		{"임승현","장효정","박광천","이성진","박효진",
		"이정림","최진환","강강석","김재현","김윤지",
		"권민호","박현수","김지현","한승호","류아영",
		"이예린","김일도","이승재","박현근","나병수",
		"이규복","윤예진","김순호","서동찬","정일한",
		"윤원식","염승희"};

	private final static int saram = name.length;
	
	public static void main(String[] args) {
				
		Thread ob = new MyThread();
		
		Scanner sc =new Scanner(System.in);
		Random rd = new Random();
		
		int num [];
		int inwon,i,n;
		
		do {
			System.out.print("발표자 인원수 : ");
			inwon=sc.nextInt();
			
		}while(inwon<1||inwon>saram);
		
		num= new int[inwon];
		
		n=0;
		
		while(n<inwon) {
			
			num[n] = rd.nextInt(saram)+1;
			
			for(i=0; i<n;i++) {
				if(num[i]==num[n]) {
					n--;
					break;
				}
			}
			n++;
		}
		
		System.out.print(" 고 민 중 ");
		ob.start();
		
		try {
			
			ob.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println();
		System.out.println();
		System.out.println("축하합니다!! 발표자 입니다~");
		System.out.println();
		
		int cnt=1;
		for(int su : num) {
			System.out.printf(cnt +"번 발표자 : %5s\n",name[su-1]);
			cnt++;
		}

		System.out.println();
		
	}

}

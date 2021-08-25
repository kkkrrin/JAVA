package com.day05;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		//만년 달력  - 1년 1월 1일은 월요일부터 시작.
		//일요일을 보면 7로 나눠서 0으로 떨어짐
		//토요일 - 7로 나누면 6으로 떨어짐.
		//일~토 까지 0,1,2,3,4,5,6으로 나눠 떨어짐 (7로 나눔.)

		//연도, 월 두개 값을 받는다.

		Scanner sc=new Scanner(System.in);

		int y, m, nalsu,week,i;

		int months[]={31,28,31,30,31,30,31,31,30,31,30,31};

		//입력 
		do {
			System.out.print("년도:");
			y=sc.nextInt();

		}while(y<1);

		do {
			System.out.print("월:");
			m= sc.nextInt();
		}while (m<1||m>12);

		sc.close();

		//윤년에 따른 2월의 날 수 게산

		if(y%4==0&&y%100!=0||y%400==0) {// 윤년
			months[1]=29;
		}

		//1년 1월 1일부터 사용자가 입력한  전년(y-1) 12월 31일까지의 날 수 (윤년 포함)
		nalsu=(y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400 ;//%는 /주고 &&빼주고 ||는 더한다 (공식)

		//		System.out.println(nalsu);
		//		int yy= (y-1)/4-(y-1)/100+(y-1)/400 ;
		//		System.out.println(yy);

		//사용자가 입력한 y년 1월부터 (m-1)월 까지의 날 수 	
		//날 수 : {31,28,31,30,31,30,31,31,30,31,30,31};

		//		 y년 1월부터 (m-1)월 까지의 날 수 
		for( i=0; i<m-1; i++) {
			nalsu= nalsu+months[i];

		}

		//System.out.println(nalsu);
		nalsu+=1; //nalsu=nalsu+1; (y년 m월 1일 까지의 날 수)
		week=nalsu%7;
		//System.out.println(week);

		//달력 모양 만들기 

		System.out.println("\n  일  월  화  수  목  금   토");
		System.out.println("-------------------------------");

		//특정요일부터 시작하도록 공백 지정 
		for(i=0;i<week;i++) {
			System.out.print("    "); //4칸 공백(한글 2바이트)
		}

		for(i=1;i<=months[m-1];i++) {
			System.out.printf("%4d",i); //자리 지정 

			// 한 주의 날짜가 출력되면 줄바꿈
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}

		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("------------------------------");
		sc.close();

	}
}


// 맥북이라 결과물이 2021,7월 날수가 수요일부터 찍힘.. 제대로 된 코딩 맞음. 
// 밑에 for문 주의 


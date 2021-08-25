package com.score3;

import java.util.Scanner;

public class ScoreImpl2 implements Score2{

	private int inwon; 
	private Record2 [] rec;  //큰 틀

	Scanner sc= new Scanner(System.in);


	@Override
	public void set2() {

		do {
			System.out.print("회원 수 : ");
			inwon=sc.nextInt();
		}while(inwon<1||inwon>10);

		rec=new Record2[inwon];  // inwon(0)의 record2 타입을 배열 rec에 저장.( 3개 입력시 3개의 배열이 생성 (방을 생성))
	}

	@Override
	public void input2() {

		for (int i=0; i<inwon; i++) {
			
			rec[i]=new Record2(); // 생성자. 만들어서 배열에 저장한다. 

			System.out.print("회원 이름 : ");
			rec[i].name=sc.next();
			System.out.printf("member number : ");
			rec[i].memnum=sc.next();
			System.out.print("Age : ");
			rec[i].age=sc.nextInt();
			System.out.print(" Height : ");
			rec[i].height=sc.nextInt();
			System.out.print(" Weigth : ");
			rec[i].weigth=sc.nextInt();		
		}
	}

	private String Bmi(int w, int h) {
		// 체중 /키*키  계산 안됨 . 
		int result=0;
		result=w/(h*h);
		String su=" ";
		
		switch(result/10000) {

		case 25:
			su="비"; break;

		case 23:
			 su="과체중  "; break;

		case 22:
			 su="마른 비만 "; break;

		case 20:
		case 21:
			 su=" 건강한 정도의 마름 "; break;
		case 19:
		case 18:
			 su=" 마름"; break;
		default:
			su="측정불가"; break;
		}
		return su; 

	}

	@Override
	public void print2() {
		
		for(int i=0; i<inwon;i++) {
			System.out.printf("%s %s %d %d %d %s", rec[i].name,rec[i].memnum,rec[i].age,rec[i].
					height,rec[i].weigth,Bmi(rec[i].weigth,rec[i].height)); // 이름,멤버번호, 나이, 키, 몸무게, 결과

			System.out.println();
					}


	}
}

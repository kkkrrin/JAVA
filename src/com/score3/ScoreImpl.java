package com.score3;
//score interface 구현 

import java.util.Scanner;

public class ScoreImpl implements Score { 

	private int inwon;
	private Record [] rec;

	Scanner sc =new Scanner(System.in);

	@Override
	public void set() { // 배열의 갯수 

		do {
			System.out.print("인원수 ?");
			inwon=sc.nextInt();
		}while(inwon<1||inwon>10);

		rec = new Record[inwon]; // 배열 객체 생성. ( 	큰 틀 ! ) ( 파일철..)
	}

	@Override
	public void input() {

		for(int i=0; i<inwon; i++) {

			rec[i]=new Record();

			System.out.print(" 학번 : ");
			rec[i].hak=sc.next();

			System.out.print(" 이름 : ");
			rec[i].name=sc.next();

			System.out.print("국어 점수 : ");
			rec[i].kor= sc.nextInt();

			System.out.print(" 영어 점수 : ");
			rec[i].eng=sc.nextInt();

			System.out.print("수학 점수 : ");
			rec[i].math=sc.nextInt();

			rec[i].tot=rec[i].kor+rec[i].eng+rec[i].math;
			rec[i].avg=rec[i].tot/3;

		}
	}

	private String panjung(int score) { // 자율로 만들 수 있음.  ( 매개변수 이름은 변수 선언한거라. 그냥 아무렇게 줘도됨. 
		String pan =""; // pan 초기화 해야함! 
		switch(score/10) { // 간단하게 하려고 10 나눔. 
		case 10:
		case 9:
			pan="A"; break;

		case 8:
			pan="B"; break;

		case 7:
			pan="C"; break;

		case 6:
			pan="D"; break;

		default:
			pan="F"; break;

		}
		return pan; 	
	}




	@Override
	public void print() {
		
	//	panjung(score);
		
		for( int i =0; i<inwon; i++) {
			System.out.printf("%s %s %d %d %d %d %d %s",
					rec[i].hak, rec[i].name,rec[i].kor,rec[i].eng,rec[i].math,rec[i].tot,rec[i].avg,
					panjung(rec[i].avg));
			System.out.println();

			}			
		}


	}


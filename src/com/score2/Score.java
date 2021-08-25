package com.score2;
//메인절 없는 score
// 배열을 사용하는 것 ?

import java.util.Scanner;

public class Score {
	int inwon; //전역변수 (instance) = 멤버변수  초기화 =0;
	Record [] rec;  //클래스 배열 초기값 null

	Scanner sc = new Scanner(System.in);
	// 밖에 선언가능 (예외 존재)

	public void set() {
		do {
			System.out.print("인원수 : ");
			inwon=sc.nextInt();
		}while (inwon<1||inwon>10);

		// record 의 객체를 생성한게 아니라. rec 변수에 배열을 생성한 것. 
		// 클래스의 초기값은 null / string도 null ( String도 클래스) 
		rec = new Record [inwon]; 
	}

	public void input() {
		String title [] = {"국어?","영어?","수학?"};

		for(int i=0; i<inwon;i++) {
			rec[i] = new Record(); // 객체 생성 (record 클래스에 string name 존재)

			System.out.printf("%d번째 이름 : ",i+1);
			rec[i].name =sc.next();

			for( int j=0;j<inwon; j++) {
				System.out.print(title[j]);
				rec[i].score[j]=sc.nextInt(); //국, 영, 수 점수 받아냄. 
				rec[i].tot+=rec[i].score[j];
			}

			// 위 반복문으로 단축 
			//			System.out.print(" 영어 점수 : ");
			//			rec[i].score[1]=sc.nextInt();
			//			System.out.print("수학 점수 :");
			//			rec[i].score[2]=sc.nextInt();
			// rec[i].tot=rec[i].score[0]+rec[i].score[1]+rec[i].score[2];

			rec[i].avg=rec[i].tot/3;
		}
	}

	// 석차 구하기. 
	// 비교해서 작은 쪽에 +1 초기값은 1. 

	private void ranking() {
		int i,j;

		//rank 초기화 
		for(i=0;i<inwon;i++) {
			rec[i].rank=1;
		}

		//석차 구하기
		// selection sort 
		for(i=0; i<inwon-1;i++) {
			for (j=i+1;j<inwon;j++) {
				if(rec[i].tot>rec[j].tot) {
					rec[j].rank++;
				}else if (rec[i].tot<rec[j].tot){
					rec[i].rank++;
				}
			}
		}		
	}

	private String panjung(int jumsu) {  //등급 판정

		String pan=" ";
		switch(jumsu) {

		case 100: 
		case 90:
			pan="수"; break;
		case 80:
			pan="우"; break;
		case 70:
			pan="미"; break;
		case 60:
			pan="양"; break;
		default:
			pan="가"; break;

		}
		return pan;
	}

	public void print() {

		ranking(); // main문에서 ranking접근 불가 print에서 호출한다 ( 메소드에서 메소드 호출) 
		
		for ( int i=0;i<inwon;i++) {
			System.out.printf("%6s",rec[i].name); // 이름
			for(int j=0;j<3;j++) {
				System.out.printf("%4d ",rec[i].score[j]);// 점수 //배열  불러올 때 score[j] 자꾸 까먹음. 
				System.out.printf("(%s) ",panjung(rec[i].score[j]));	//메소드에서 panjung메소드 호출(private)
				
		}
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d",rec[i].avg);
			System.out.printf("%4d \n",rec[i].rank);

		}
	}

}

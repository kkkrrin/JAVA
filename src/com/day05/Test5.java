package com.day05;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//10 이내의 이름과 점수를 입력받아 석차구하기 , 석차 순 정렬 (1,2,3 오름차순 )

		Scanner sc= new Scanner(System.in);

		String[] name;
		int [] score; //입력받을 만들 개수가 정해지지 않았을 경우의 선언방법
		int []rank;

		int i,j,inwon,tmp1;
		String tmp2;

		do {
			System.out.print("인원수[1~10]");
			inwon =sc.nextInt();
		}while (inwon<1||inwon>10);

		//배열 객체 생성(메모리 할당)
		name=new String[inwon];
		score= new int [inwon];
		rank=new int[inwon];

		//인원수 만큼 이름과 수를 입력
		for(i=0;i<inwon;i++) {
			System.out.print("이름 : ");
			name[i]= sc.next();
			System.out.print("점수:");
			score[i]=sc.nextInt();
		}

		//석차 초기화
		for(i=0;i<inwon;i++) {
			rank[i]=1;
			}
		
		//정렬
		//석차 구할때 비교해서 작은 부분에 +1 (오름차순이라)

		for(i=0;i<score.length-1;i++) {
			for(j=i+1;j<score.length;j++) {
				if(score[i]>score[j]) {
					rank[j]++;
					}else if(score[i]<score[j]) {
						rank[i]++;
					}
			}
		}

		//출력	
		for (i=0;i<inwon;i++) {
			System.out.printf("%6s %4d %d \n",name[i],score[i],rank[i]);
		}

	}
}


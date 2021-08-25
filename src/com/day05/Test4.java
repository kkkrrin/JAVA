package com.day05;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//10 이내의 이름과 점수를 입력받아 점수가 높은사람 순에서 낮은 사람 순으로 출력

		Scanner sc= new Scanner(System.in);

		String[] name;
		int [] score; //받을? 만들 개수가 정해지지 않았을 경우의 선언방법

		int i,j,inwon,tmp1;
		String tmp2;

		do {
			System.out.print("인원수[1~10]");
			inwon =sc.nextInt();
		}while (inwon<1||inwon>10);

		//배열 객체 생성(메모리 할당)
		name=new String[inwon];
		score= new int [inwon];

		//인원수 만큼 이름과 수를 입력
		for(i=0;i<inwon;i++) {
			System.out.print("이름 : ");
			name[i]= sc.next();
			System.out.print("점수:");
			score[i]=sc.nextInt();
		}

		//정렬

		for(i=0;i<score.length-1;i++) {
			for(j=i+1;j<score.length;j++) {
				if(score[i]<score[j]) {
					tmp1=score[j];
					tmp2=name[j];
					score[j]=score[i];
					name[j]=name[i];
					score[i]=tmp1;
					name[i]=tmp2;
				}
			}
		}

		//출력	
		for (i=0;i<inwon;i++) {
			System.out.printf("%6s %4d \n",name[i],score[i]);
		}

	}

}

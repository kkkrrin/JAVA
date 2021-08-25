package com.score4;
// 입력 받는 곳

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	Score ob = new ScoreImpl();
	
	int ch; 
	while(true) {
		do {
			System.out.print("1. 입력  2. 출력  3. 학번 검색  4. 이름검색  5. 총점정렬  6.학번정렬  7.종료  : ");
			 ch=sc.nextInt();
		}while (ch<1);
		
		switch(ch) {
		
		case 1: 
			ob.input(); break;
		case 2:
			ob.print(); break;
		case 3: 
			ob.searchHak(); break;
		case 4:
			ob.searchName(); break;
		case 5: 
			ob.descSortTot(); break;
		case 6:
			ob.ascSortHak(); break;
		default:
			System.out.println(" 프로그램 종료 ");
			System.exit(0); //  종료 명령어. 
		}
	}
				
		
//		ScoreVO ob = new ScoreVO();
//		
//		ob.setHak("16037040");
//		ob.setName("lee ye rin ");
//		ob.setKor(90);
//		
//		System.out.println(ob.getHak());
//		System.out.println(ob.getName());
//		System.out.println(ob.getKor());
	

	}

}

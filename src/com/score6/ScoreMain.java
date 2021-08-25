package com.score6;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		Score vo = new Score();

		int ch;
		while(true) {
			do {
				System.out.print("1. 입력  2. 출력  3. 종료  : ");
				ch=sc.nextInt();
			}while (ch<1);

			switch(ch) {
			case 1: 
				vo.input();  break;
			case 2:
				vo.write();
				break;
			case 3:vo.writeFile();  break;
			default : 
				vo.writeFile(); 
				System.out.println(" 프로그램 종료 ");
				System.exit(0); 
			}
		}	


	}

}

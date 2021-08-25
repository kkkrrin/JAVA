package project01;

import java.util.Scanner;

public class DiaryMain {

	public static void main(String[] args) {
		DiaryImpl da= new DiaryImpl();
		Scanner sc= new Scanner(System.in);
		int ch;
		
		
		System.out.println("***********************************");
		System.out.println("*                                                                        *");
		System.out.println("*                                                                        *");
		System.out.println("*                                                                        *");
		System.out.println("*                                                                        *");
		System.out.println("*                        Welcome!                               *");
		System.out.println("*                                Diary!                              *");
		System.out.println("*                                                                        *");
		System.out.println("*                                                                        *");
		System.out.println("*                                                                        *");
		System.out.println("*                                                                        *");
		System.out.println("***********************************\n");


		

		while(true) {
			do {
				System.out.print("1. 회원가입   3.데이터확인   4. 종료: ");
				// 3은 저장확인용
				ch=sc.nextInt();
			}while(ch<1);

			switch(ch) {
			case 1:da.join(); da.writeFile(); break;
			//case 2:da.writeFile(); break;
			case 3:da.print(); break; 
			case 4: //da.endprint(); System.exit(0);
			default: System.out.println("종료");  System.exit(0);

			}
		}
	}
}

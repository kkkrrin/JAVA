package project02;

import java.util.Scanner;
class MyThread1 extends Thread{
	String[] diary = {
			"************************************",
			"* ★                            ♡ *",
			"*   ○                        ♥   *",
			"* ●       ⓦⓔⓛⓒⓞⓜⓔ       ◇ *",
			"*   ☆                        ◆   *",
			"* ▲           ㉤ｒ＠ㅣ         △ *",
			"*   △                        ▲   *",
			"* ◆    Ｄr  2I  ⓞ ┨ 乙Ｉ™  ☆  *",
			"*   ◇                         ●  *",
			"* ♥                            ○ *",
			"*   ♡                 by 7조 ~＊  *",
			"***********************************\n",
			"     (엔터키를 누르면 실행됩니다.)   "
	};
	@Override
	public void run() {
		for(String i : diary) {
			System.out.println(i);
			try {
				sleep(500);
			} catch (Exception e) {
				System.out.println(e.toString());

			}
		}

	}
}
public class DiaryMain {

	public static void main(String[] args) {
		MyThread1 th = new MyThread1();
		DiaryImpl da= new DiaryImpl();
		Scanner sc= new Scanner(System.in);
		
		String insert;
		th.start();
		
		insert = sc.nextLine();
		if(insert != "") {

		int ch;
			
		while(true) {
			do {
				System.out.println("              My Diary");
				System.out.println("");
				System.out.println("1. 로그인 ┃ 2. 회원가입 ┃ 3. 종료");
				System.out.println("");
				System.out.print("선택 : ");
				ch=sc.nextInt();
				System.out.println("");
				
			}while(ch<1);

			switch(ch) {
			case 1:
				da.login();
				break;
			case 2:
				da.join();
				da.writeFile();
				break;

			case 10:
				da.print();
				break; 
			case 3: 
			default: System.out.println("종료합니다.");  
			System.exit(0);

			}
			
		}
		
		}
		else {
			System.out.println("틀렸찌롱");
			
		}
		
	}
	
}

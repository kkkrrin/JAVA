package com.day06;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 주민등록번호 
		// jumin: 030225-4025648
		// chk : 024567 892345
		//합 = (0*2)+(3*3)+(0*4)+ ...(4*5)
		//합 = 11-합%11 ((합%11)0-10사이 값)
		//합 = 합 %10 =(0-9사이값)
		//합 == 8  같아야 정상 주민번호 

		Scanner  sc = new Scanner(System.in);
		String jumin;
		int chk[]= {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;

		System.out.print("주민 번호 입력하세요[xxxxxx-xxxxxxx] : ");
		jumin=sc.next();

		if(jumin.length()!=14) { // length는 배열만 () 없음! 
			System.out.println("입력 오류!");
			return ; //입력 오류인 경우  종료의 의미로 사용 ( 반복문이 아니기 때문에 break 아님)
		}

		// jumin: 030225-4025648
		// chk : 234567 892345

		tot=0;
		for(i=0;i<12;i++) { // 주민의 -랑, 마지막 넘버는 제외하기 때문에 12까지 
			if(i>=6) { // - 뒤 숫
				tot+=chk[i]*Integer.parseInt(jumin.substring(i+1, i+2));

			}else { // 생년월일 비교 
				tot+=chk[i]*Integer.parseInt(jumin.substring(i,i+1));
			}
		}
		su= 11-tot%11;
		su= su%10;
		if(su==Integer.parseInt(jumin.substring(13)))
			System.out.println("정확한 주민번호 입니다 ! ");
		else System.out.println("부정확한 주민번호 입니다.");
	}
}

//		String str = "seoul korea";
//		index 생성 : 0,1,2,3,4,5,6,7,---
//		System.out.println(str.substring(0, 3)); //인덱스 읽어옴
//		System.out.println(str.substring(6, 8)); //인덱스 읽어옴
//		System.out.println(str.substring(1)); //1부터 끝까지 ( 입력 수 부터 끝까지 출력) 
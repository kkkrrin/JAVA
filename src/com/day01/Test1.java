package com.day01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		int kor,eng,math;
		int avg,add;
		String name,str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name=sc.next();
		System.out.print("세 과목의 점수: ");
		kor=sc.nextInt();
		eng=sc.nextInt();
		math=sc.nextInt();
		
		avg=(kor+eng+math)/3;
		add=kor+eng+math;
		
		if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
			 str="합격";
		}if(avg>=60) {
			 str="과락";
		} else {
			 str="불합격";
		}
		System.out.println("이름:"+name);
		System.out.println("총점 :" +add+ " 평균:"+avg+" 판정:"+str);
		sc.close();
	}

}

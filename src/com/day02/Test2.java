package com.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, math,eng,tot;
		
		System.out.print("이름 : ");
		
		name = br.readLine(); //readLine 은 String 을 반환하기때문에 다른 형변환 필요없음. 
		System.out.print("국어점수 : ");
		
		kor = Integer.parseInt(br.readLine());
		System.out.print("수학점수 : ");
		
		math = Integer.parseInt(br.readLine());
		System.out.print("영어점수 : ");
		
		eng= Integer.parseInt(br.readLine());
		
		tot= kor+math+eng;
		
		System.out.printf("이름:%s \n 국어점수:%d \n 수학점수:%d\n 영어점수:%d\n",name,kor,math,eng);
		
		System.out.println("total:" + tot);
		
	
	}

}

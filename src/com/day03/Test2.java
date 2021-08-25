package com.day03;

import java.util.Scanner;

public class Test2{

	public static void main(String[] args) {
		
		String name;
		int kor,eng,mat;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 국어 영어 수학?"); //( 공백이 구분한다.)
		
		//sc= new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		name=sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + ":"+ (kor+eng+mat) +"점");
		sc.close();		
		
	
	}

}

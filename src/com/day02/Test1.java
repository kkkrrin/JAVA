package com.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 


public class Test1 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			//System.in : 키보드로 값을 입력받음 (1바이트)
		//InputStreamReader: system in 으로 받은 1byte를 문자로 변경(형변환)
		//BufferedReader : 받은 문자를 메모리상 버퍼에 저장

		
		int r;
		double area,length;
		
		System.out.print("반지름 :"); //10
		
		r = Integer.parseInt(br.readLine()); // 형변환 
		//r= Double.parseDouble(br.readLine()); //실수 형변환
		
		
		//readLine() 읽어온걸
		//Integer.parseInt 형변환해서 저장
	
		area = r*r*3.14; // 자바는 소수점 만나면 더블로인식
		length = r*2*3.14;
		
		System.out.println("반지름" + r);
		System.out.println("넓이:" +area);
		System.out.println("둘레:" +length);
		
	}

}

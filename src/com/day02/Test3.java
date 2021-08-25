package com.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int w,h,a;
		
		System.out.printf("밑변 :");
		w= Integer.parseInt(br.readLine());
		
		System.out.printf("높이:");
		h= Integer.parseInt(br.readLine());
		
		a=( w*h)/2;
		
		System.out.println("넓이는 = " + a);
		
		
		
		
		
		

	}

}

package com.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// 원본 파일 위치 
		// 대상 파일 위치
		// 복사완료 
		// Test4 
		
		
		Scanner sc = new Scanner(System.in);
		
		String str1, str2 ;
		
		int data;
		
		try {
			System.out.println("원본경로 : ");
			str1=sc.next();
			
			System.out.println("대상 경로 : ");
			str2=sc.next();
			
			FileInputStream fis= new FileInputStream(str1);
			FileOutputStream fos = new FileOutputStream(str2);
			
			while((data=fis.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			fis.close();
			fos.close();
			
			System.out.println(" 복사 완료 !!");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}

package com.day15;
//FileOutputStream
// 파일 내보내기 !!!

import java.io.FileOutputStream;

public class Test6 {

	public static void main(String[] args) {
		try {

			FileOutputStream fos= new FileOutputStream("//Users//yerin//doc//out1.txt");

			int data;
			System.out.println("문자열 입력하세요 : ");

			while((data=System.in.read())!=-1) {
				fos.write(data); // 데이터 내보내기
				fos.flush(); // 없어도됨. 
			}

			fos.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

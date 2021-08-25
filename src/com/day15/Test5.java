package com.day15;
//FileInputStream
// 파일 읽어오기!!!!!

import java.io.FileInputStream;

public class Test5 {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("//Users//yerin//doc//doc.txt");
			// 윈도우로사용할땐, txt파일 ansi 로 바꿔서 저장해야함.  
			// 윈도우로 할땐 역슬러시 써야함. 

			int data;
			while((data=fis.read())!=-1) {
				//System.out.println(data); 는 못읽어옴. 
				System.out.write(data);
				System.out.flush(); // 	버퍼가 꽉 채우지 않아도 출력해라. ( 다 출력해라 ) 
			}
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

package com.day15;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test8 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos;  // 파일로 내보냄. 
			PrintStream ps; 
			
			fos = new FileOutputStream("/Users//yerin//doc//out2.txt"); // 객체 생성 
			ps= new PrintStream(fos); // 객체 생성
			ps.println("이에린");
			ps.println("MacBook"); //Ps의 pirntln 으로 해줘야함. 
			ps.println("yerin's macbook");
			
			ps.close();
			fos.close();
			
			fos = new FileOutputStream("/Users//yerin//doc//out2.txt",true); // 객체 생성 
			ps= new PrintStream(fos); // 객체 생성
			ps.println("이에린 1");
			ps.println("MacBook 1"); //Ps의 pirntln 으로 해줘야함. 
			ps.println("yerin's macbook 1");
			// 기존 데이터에 덮어 씌워진다.  근데 위에 true 주면 append  누적이 됨. 
			ps.close();
			fos.close();
			
					
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

package com.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//test 11 다른 버전

public class Test12 {

	public boolean fileCopy(String file1, String file2) {
		File f= new File(file1);

		if(!f.exists()) { //파일 없으면
			return false;
		}

		try {

			FileInputStream fis = new FileInputStream(f); // == file1 
			FileOutputStream fos = new FileOutputStream(file2);

			int readdata=0; // 파일 읽어오는 작업

			byte [] buffer = new byte[1024]; //1KB buffer배열 바이트 

			while((readdata=fis.read(buffer, 0, 1024))!=-1) { // buffer 에서, 0부터 1024자를 읽어낸다.
				fos.write(buffer, 0, readdata); // 내보낸다. buffer에서 0부터 데이터가 있는 거까지. 
			}

			fos.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e.toString());
			return false; 
		}

		return true;

	}

	public static void main(String[] args) {

		Test12 ob = new Test12();
		String str1 =" //Users//yerin//doc//doc.txt";  // 원본 
		String str2 = "//Uses//yerin//doc//out4.txt";     // 복사본 


		if(ob.fileCopy(str1, str2)) {
			System.out.println("성공");	
		}else {
			System.out.println("실패");
		}
	}

}

package com.day16;

import java.io.File;
import java.io.FileOutputStream;

public class Test1 {

	public static void main(String[] args) {

		String path= "//Users//yerin//doc1//test.txt"; // doc1//test.txt 는 없는상태. 

		File f= new File(path);

		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();	//doc 1 폴더만 만들어진다. 
		}

		try {

			FileOutputStream fos =new FileOutputStream(path);//test.txt 만들기. 
			System.out.print("문자열 입력 : ");

			int data;
			while((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

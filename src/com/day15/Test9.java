package com.day15;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// File - class
// 파일 및 폴더를 관리해주는 기능을 갖고있다. 
// 파일에 대한 정보를 읽어내는 역할만 할 뿐, 파일의 내용을 입출력하는 메소드는 없다. 

public class Test9 {

	public static void main(String[] args) throws IOException {
		
		File f= new File("//Users//yerin//doc//doc.txt");
		
		System.out.println(" 파일명 : " + f.getName());
		System.out.println(" 파일 크기 : " + f.length());
		System.out.println(" 파일 경로 : "+ f.getAbsolutePath());
		System.out.println(" 파일표준 경로 : "+ f.getCanonicalPath()); // error 처리 
		System.out.println(" 파일 생성 날 : " + new Date(f.lastModified()));
		System.out.println(" 디렉토리 : " + f.getParent());
		System.out.println(" 읽기 속성 : "+ f.canRead());
		System.out.println(" 쓰기 속성 : "+ f.canWrite());

		String path = System.getProperty("user.dir");
		System.out.println(" 현재 프로젝트 경로 : "+ path);
		
		
	}

}

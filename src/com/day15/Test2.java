package com.day15;

import java.io.IOException;
import java.io.OutputStream;

//기본 입출력 : out 

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		byte [] b= new byte[3]; 
		b[0]= 65;
		b[1]=97;
		b[2]=122;
		// 아스키 코드,. 결과값  Aaz 출력.
		
		
		os.write(b);
		os.close();
		// Stream 사용 후 닫아줘야함. 
		// IOException
		
		System.out.println(" 수고했어 Stream.out"); // 출력 안됨. 
		
	}

}

package com.day15;

//Test5 랑 비슷

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("//Users//yerin//doc//doc.txt");
			BufferedReader br= new BufferedReader(new InputStreamReader(fis));

			String str; 
			
			while((str =br.readLine())!=null) { //String 이니까, null 
				System.out.println(str);
			}
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
			}
		
	}

}

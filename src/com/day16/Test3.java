package com.day16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		// 역직렬화 (화일 내용을 꺼내온다?)
		
		try {
			
			FileInputStream fis = new FileInputStream("//Users//yerin//doc//out5.txt"); // 직렬화 된거 읽어오기
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Hashtable<String, String> h= (Hashtable<String, String>) ois.readObject(); // 다운캐스팅, 형변환  
			
			Iterator<String> it = h.keySet().iterator();
			while(it.hasNext()) {
				String key=it.next();
				String value=h.get(key);
				System.out.println(key+" : "+value);
			}
			
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

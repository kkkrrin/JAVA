package com.day16;
//객체의 직렬화 
//메모리에 생성된 클래스 변수( instance) 의 현재상태를 그대로 보존해서 파일에 저장.
// 네트워크를 통해 전달 할 수 있는 기능

// 오로지 바이트 단위로만 데이터를 송수신

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

// 장점 : 객체 자체의 내용을 입출력 형식에 구애받지 않고 
// 객체  파일에 저장함으로써 영속성을 제공할 수 있고 
// 객체 자체를 네트워크를 통해 손쉽게 교환할 수 있다.

// implements Serializable 로 구현하는데 메소드는 없다.
// -> 이 코드에서 구현 안한이유는 컬렉션은 이미 직렬화가 되어잇다. 


//Test3에서 Test2  불러오는(역직렬화) 작업 함. 

public class Test2 {

	public static void main(String[] args) {

		try {
			// 직렬화 작업 
			Hashtable<String, String> h = new Hashtable<String, String>();

			h.put("1", "이에린");
			h.put("2", "leeyerin");
			h.put("3", "배수지");

			FileOutputStream fos =new FileOutputStream("//Users//yerin//doc//out5.txt"); // 파일만 만든다.
			
			ObjectOutputStream oos= new ObjectOutputStream(fos); // 데이터 넣어준다 ( 직렬화된 것만 가능) 
			oos.writeObject(h);
			
			oos.close();
			fos.close();
			
			// 데이터가 깨져서 나옴 ( 난 유니코드가 아니라 아예 안열림. -> 깨져서 열리기때문에 따로 확인해주는 코드를 짜면됨.-test3) 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

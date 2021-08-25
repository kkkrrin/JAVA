package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 직렬화한 파일은 알수 없는 코드로 작성되기때문에 파일이 열리지 않음. 
// 출력되는거 확인해보면 정상작동됨을 확인할 수 있다. 


public class MyDataMain {

	public static void main(String[] args) {

		try {

			// 직렬화 ( 데이터 입력) 

			FileOutputStream fos = new FileOutputStream("//Users//yerin//doc//MyData.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos); // 직렬화 된것만 내보낸다. 

			oos.writeObject(new MyDataVO("이예린",100,"111"));
			//new 로 객체 생성해서 사용한다. 
			oos.writeObject(new MyDataVO("배수지",90, "111"));
			oos.writeObject(new MyDataVO("양승민",80, "111"));
			oos.writeObject(new MyDataVO("응가", 99, "111" ));
			oos.writeObject(new MyDataVO("에린", 98, "111"));

			oos.close();
			fos.close();

			// 역 직렬화  (데이터 출력) 

			FileInputStream fis= new FileInputStream("//Users//yerin//doc//MyData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			MyDataVO vo ; // while 문 안에 여러개 생성할 필요 없어서 바깥에 선언. 

			while( true ) { // 실제 데이터 몇 개가 존재하는지 모를때 true 

				vo =(MyDataVO)ois.readObject(); // object 타입으로 꺼내-> 다운캐스팅

				if(vo==null) { // 데이터 다 조회한경우. 
					break;
				}
				System.out.println(vo.toString());

			}

			ois.close();
			fis.close();



		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

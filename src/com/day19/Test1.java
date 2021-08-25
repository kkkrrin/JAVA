package com.day19;
// class  클래스 ( 클래스의 이름이 class) 
// 특정 클래스나 인터페이스의 정보를 검색 할 수 있는 메소드를 포함하고있다. 

class Test{

	public void write() {
		System.out.println("Test ...");
	}
}

public class Test1 {

	public static void main(String[] args) throws Exception {
		
//		Test ob = new Test();
//		ob.write();
		
// 	제너릭. 
		Class c= Class.forName("com.day19.Test"); // 패키지이름 + 클래스 이름 
		
		Object ob = c.newInstance(); // 객체생성
		Test t= (Test)ob; // down cast
		t.write();
		
	}

}

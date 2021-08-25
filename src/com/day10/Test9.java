package com.day10;
//singleton
//객체를 계속해서 생성하는 것이 아니라 하나의 객체만 생성해서 공유 사용 

class SingTest{
	
	private static SingTest ob;
	
	public static SingTest getInstance() {
		if(ob==null) {
			ob=new SingTest();
		}
		return ob;
		
	}
	
}

public class Test9 {

	public static void main(String[] args) {
		//call by reference 
		
		SingTest ob1=SingTest.getInstance();
		SingTest ob2=SingTest.getInstance();
		
		
		if(ob1==ob2) { // 주소비교 
			System.out.println("동일한 객체  .. ");
		}

		
	}

}

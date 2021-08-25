package com.day14;

class MyException extends Exception{

	 private static final long serialVersionUID = 1L;  // 클래스에 경고문 떠서 넣어준거(없어도됨) 메모리 추가해주는 문
	 
	 public MyException (String msg) {
		 super(msg); // 부모가 처리할거니까, 	 
	 }
}

public class Test3 {

	private int value; // instance 초기값 0 
	public void setValue(int value) throws MyException{
		if(value<0) {
			throw new MyException("수는 0보다 작을 수 없다."); 
			// 객체생성 문자를msg 에 넘긴다.//내가 만드는에러는 throws s 없음 
		} else {
			this.value  = value;
		}
	}
	
	public int getValue() {
		return value;
	}
	

	public static void main(String[] args) {
		
		Test3 ob = new Test3();
		try {
			ob.setValue(-10);
			
		} catch (MyException e) {
			System.out.println(e.toString());  //error 메세지. 
					}
		System.out.println(ob.getValue());

	}
}

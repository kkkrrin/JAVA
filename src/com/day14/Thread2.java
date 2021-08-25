package com.day14;
// 다중상속이 안돼서 인터페이스로 구현. 

class Mythread2 implements Runnable{
	
	private int num;
	private String name;
	
	public Mythread2(int num, String name) {
		this.num=num;
		this.name=name;
		
	}
	

	@Override
	public void run() {
		
		int i=0;
		
		while(i<num) {
			System.out.println(name + " : "+i);
			i++;
			
			try {
				
				Thread.sleep(100); // 인터페이스 슬립은 이런 형태로 
				// try- catch 예외처리문 에서만 사용가능. 
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}					
	}
}


public class Thread2 {

	public static void main(String[] args) {
		
		System.out.println("Main 시작");
		Thread t1= new Thread(new Mythread2(100,"첫번째"));
		Thread t2= new Thread(new Mythread2(200,"두번째"));
		
		t1.start();
		t2.start();
		
		System.out.println("Main 종료 ");

		
		
	}

}

package com.day15;

class Mythread3 extends Thread {

	@Override
	public void run() {
		try {

			System.out.println("Thread start ... ");
			System.out.println("우선순위 :  "+getPriority());
			System.out.println("Thread Name : "+ getName());

			Thread.sleep(500);

			setPriority(2);
			System.out.println(" 변경된 우선수위 : "+ getPriority());
			System.out.println("End of Thread ");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}	
}


public class Thread3 {

	public static void main(String[] args) {

		Thread t1= Thread.currentThread(); // main 스레드
		Thread t2 = new Mythread3();
		
		System.out.println( " 메인 스레드 우선순위 :" + t1.getPriority());
		System.out.println( " 메인 스레드 이름 : "+ t1.getName());
		
		System.out.println(" t2 호출 전 isAlive : "+ t2.isAlive()); // t2 가 살아있는지 (실행)? ->죽음 false
		t2.start();
		
		System.out.println("t2의 우선순위 : "+t2.getPriority()); 
		t2.setPriority(1);
		
		try { // main 영향
			
			Thread.sleep(100);
			System.out.println("t2  살아 있냐 ? : "+ t2.isAlive());
			Thread.sleep(1000);
			System.out.println("(1초 후 ) t2  살아 있냐 ? : "+ t2.isAlive());
			t2.join(); // t2 끝날 때 까지 main 기다림 
			System.out.println(" 그래도  t2  살아 있냐 ? : "+ t2.isAlive());

			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
	}
}

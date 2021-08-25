package com.day15;
// 데몬스레드 : 다른 스레드에 도움을 주는 스레드
// 다른 스레드가(메인), 종료되면 데몬스레드가 종료되지않더라도 프로세스가 종료된다.
// 메인이 끝나면, 다른 스레드도 중지되는 것. 

class Mythread2 implements Runnable{

	@Override
	public void run() { // run 메소드 오버라이드

		for(int i=1; i<=20; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000); // 1초 쉬었다 찍는다.

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class Thread2 {

	public static void main(String[] args) {

		System.out.println("Main Thread start ...");

		Thread t1= new Thread(new Mythread2()); // thread.runnable target ()
		Thread t2= new Thread(new Mythread2());
		Thread t3= new Thread(new Mythread2());

		t1.setDaemon(true); 
		t2.setDaemon(true); 
		t3.setDaemon(true); 

		t1.start();
		t2.start();
		t3.start();

		try {

			Thread.sleep(1000);  // 메인문 1초 쉬게 한다. 

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			t1.join(); // t1 스레드가 종료할 때까지 (메인스레드) 기다려 
			t2.join();
			t3.join();

		} catch (Exception e) {
					}

		System.out.println("End of Main Thread ");


	}

}

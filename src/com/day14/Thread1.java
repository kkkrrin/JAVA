package com.day14;
// 다중작업할 때 쓰는게 스레드. -> 구현 방법 2가지. 

class Mythread1 extends Thread{ 
	
	private int num;
	private String name;
	
	public Mythread1 (int num, String name) {
		this.num=num;
		this.name=name;
	}

	
	// 스레드가 갖는 메소드 run()

	@Override
	public void run() {
		int i=0;
		while(i<num) {
			System.out.println(this.getName()+ " : " +name + i);
			i++;
			
			try {
				sleep(100);  // 번갈아서 실행됨. 
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}

public class Thread1 {

	public static void main(String[] args) {
		
		System.out.println("Main Start ... ");
				
		Mythread1 t1= new Mythread1(100, "첫번째 : ");
		Mythread1 t2= new Mythread1(200, "두번째 : ");
		
		t1.start(); // 스레드 호출  VM 이  run 을 호출한다. virtual 머신
		t2.start();
		
		// 스레드 실행 : 실행된 스레드 3개 ?(t1,t2,main) -> main절 자체도 스레드.  
	
		System.out.println("Main 종료...");

	
	}

}

package com.day15;
//우선순위 

class Mythread1 extends Thread{
	
	private String name;
	
	public Mythread1(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
				for(int i=1; i<=20; i++)
					System.out.println(name + " : " + i);
	}
}

public class Thread1 {

	public static void main(String[] args) {
		
		Mythread1 ob1= new Mythread1("A");
		Mythread1 ob2= new Mythread1("B");
		Mythread1 ob3= new Mythread1("C");
		
		System.out.println("MIN :  "+ Thread.MIN_PRIORITY); //1
		System.out.println("NOR :  "+ Thread.NORM_PRIORITY);//5  기본 값 - 5 
		
		System.out.println("MAX : "+ Thread.MAX_PRIORITY);//10 숫자 큰게 우선순위 높음. 
		
		System.out.println("ob1 :"+ ob1.getPriority());//5
		System.out.println("ob2 :"+ ob2.getPriority());//5
		System.out.println("ob3 :"+ ob3.getPriority());//5
		
		// 우선순위 부여 
		ob1.setPriority(Thread.MIN_PRIORITY);
		ob2.setPriority(Thread.NORM_PRIORITY);
		ob3.setPriority(Thread.MAX_PRIORITY);
		// 정확히 나눌 수 없지만 ( 섞여있음) 그래도 모여서 출력됨. 

		ob1.start(); // run() 으로 가서 점유 
		ob2.start();
		ob3.start();
	
		
	}
}

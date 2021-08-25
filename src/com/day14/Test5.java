package com.day14; // 시간 찍기

import java.util.Calendar;

class Tclock implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.printf("%1$tF %1$tT \n",Calendar.getInstance());
			
			try {
				
				Thread.sleep(1000); // 1초. 
				
			} catch (Exception e) {
				
			}
		}
				
	}
	
}

public class Test5 {

	public static void main(String[] args) {
		
		System.out.println("Main start");
		Thread t1= new Thread(new Tclock());
		t1.start();
		
		System.out.println("End of Main");
		
	}

}

package com.day15;
// 정해진 시간마다 특정 작업하

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Thread5 extends Thread {

	private int num =0;

	public Thread5() {
		TimerTask task = new TimerTask() {

			@Override
			public void run() { // timetask 의 run 
				// 반복적으로 할 작업
				num = 0;

			}
		};

		Timer t = new Timer();

		Calendar d = Calendar.getInstance();
		/*
		 * 내일 0시0분 -초 부터 하루에 한번씩 반복 
		 * d.add(Calendar.DATE,1);
		 * d.set(Calendar.HOUR,0);  오후1시 : 13
		 * d.set(Calendar.MINUTE,0);
		 * d.set(Calendar.SECOND,0);
		 * d.set(Calendar.MILLISECOND);
		 * t.schedule(task,d.getTime(),1000*60*60*24); = 밀리세컨, 초, 분, 시  */

		t.schedule(task, d.getTime(),5000); // 5초마다 초기화작업. (위 run 실행 ) 
	}

	@Override
	public void run() { // 스레드의 run 
		while(true) {
			System.out.println(num++);

			try {
				sleep(1000);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		//Thread ob = new Thread5();
		//ob.start();
		new Thread5().start();
		
	}
}

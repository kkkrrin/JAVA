package com.day17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame{
	
	public Test2() {
		setTitle("윈도우");
		setSize(200, 300);
		addWindowListener(new MyWindowAdapter()); //(감시자) 객체를 넘겨준다. ( mywindowadap 으로 가서 실행) 
 		setVisible(true); // 창 보이게 하는 것. 
		
	}
	
	//인터페이스 사용하면 안쓰는 메소드 오버라이드 해야되니까. 
	//상속받아서 그 중 하나만 오버라이드해서 사용한다.
	//클래스 안 클래스 가능,
	
	class MyWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) { // e 로 받는다. 
			System.exit(0);
			
		} 		
	}

	public static void main(String[] args) {
		new Test2();
	}

}

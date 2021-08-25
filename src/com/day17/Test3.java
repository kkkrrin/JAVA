package com.day17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame{
	
	public Test3() {

		setTitle("윈도우");
		setSize(200, 300);
		
		addWindowListener(new WindowAdapter() { // 무명의 클래스 Test2 보다 더 간단하게 

			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});  		
		
		setVisible(true); // 창 보이게 하는 것. 
		
	}
	
	
	public static void main(String[] args) {
		new Test3();
	}

}

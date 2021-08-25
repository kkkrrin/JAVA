package com.day17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

//EVENT - 쉬어가는.. 

public class Test1 extends Frame implements WindowListener {
	
	public Test1() {
		setTitle("자바 윈도우");
		setSize(200,300);
		setBackground(new Color(255, 255, 0));
		setVisible(true); // 창 띄우는거 ( 보이게) 
		
		addWindowListener(this); // 자기자신에게 이벤트가 발생하면 
		
	}
	
	public static void main(String[] args) {
	
		new Test1();
		
	}

	// 안쓰는 메소드라도 무조건 오버라이드 하니까 Test2 에서 다른 방법으로 구현. 
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) { //exit 눌렀을때 창이 꺼진다. 
		System.exit(0);
	
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}

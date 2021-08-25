package com.day18;
// 인터페이스는 다중상속 가능
// 상속은 단일. 
// 스레드 - Runnable 

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.border.Border;

public class ClientTest extends Frame implements Runnable,ActionListener{
	
	private TextArea ta = new TextArea();
	private TextField tf  = new TextField();

	private Socket sc= null;
	private String host = "127.0.0.1"; //loopback - 자기자신
	private int port = 7777; 
	
	public ClientTest() {
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() { // 종료 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("chatting Client");
		setSize(300,400);
		setVisible(true);
		
	}
	
	public void connect() { // 내가 만든 메소드 
		
		try {
			sc=new Socket(host, port);
			
			Thread th = new Thread(this);
			th.start(); // 스레드 호출 
			
		} catch (Exception e) {
		ta.setText("Server not respond");	
		}
		
	}

	public static void main(String[] args) {
		new ClientTest().connect();
		
	}
	

	@Override
	public void run() {
		// 메세지 받을 때
		
		String str;
		
		try {
			
			if(sc==null) {
				return;
			}
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
		
			//메세지 출력
			while((str=br.readLine())!=null) {
				ta.append("\r\n"+str);
				
			}
			
		} catch (Exception e) {
			ta.append("\r\n 서버의 연결이 종료되었습니다.");
			sc=null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 메세지 보낼 때
		
		String str = tf.getText(); // getText -> 읽어내기
		
		if(str.trim().equals("")) { //trim  문자 양쪽 공백 없앰 (공백검사)
			return;
		}
		if(sc==null) {
			return;
		}
		
		try {
			//OutputStream os = sc.getOutputStream();
			
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
			pw.println("[Client1] : "+str); //client 한테 가는거
			ta.append("\r\n[Client1] :"+str); // 내 화면에 띄우기
			tf.setText("");
			tf.requestFocus();
			
			
		} catch (Exception e2) {
		ta.append("\r\n 서버와 접속이 종료되었습니다.");
		sc=null;
		}		
	}
}

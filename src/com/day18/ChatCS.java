package com.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ChatCS extends Frame implements Runnable,ActionListener{

	private MulticastSocket ms= null;
	private InetAddress XGroup=null;

	//D class : 224.0.0.0~239.255.255.255

	private String host="230.0.0.1";
	private int port=7777;
	private String userName="에";

	private TextArea ta = new TextArea();
	private TextField tf= new TextField();

	// DatagramSocket: UDP 로 데이터그램 패킷을 전송하거나 수신. 
	// DatagramPacket: UDP 를 이용해서 전송될 수 있는 데이터 
	// MulticastSocket: 다수의 클라이언트에 동시에 데이터그램을 전송 

	public ChatCS() {
		ta.setEditable(false); // tf를 클릭해서 입력할 수 없게한다. 
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("GROUP CHATTING");
		setSize(400,400);
		setVisible(true);
		tf.requestFocus();

	}

	public void setup() {

		try {
			XGroup=InetAddress.getByName(host);
			ms= new MulticastSocket(7777);

			ms.joinGroup(XGroup); // 같은 그룹으로 만듦. 

			Thread th= new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());	
		}

	}

	public void disConnect() {

		try {

			ms.leaveGroup(XGroup);
			ms.close();

		} catch (Exception e) {
			System.out.println(e.toString());	
		}

	}

	public static void main(String[] args) {
		new ChatCS().setup();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str= tf.getText().trim();
		
		if(str.equals("")) {
			return;
			
		}
		
		byte[] buffer =(userName +"]"+str).getBytes(); //(형변환)
		
		try {
			DatagramPacket dp= new DatagramPacket(buffer, buffer.length,XGroup,port);
			
			ms.send(dp);
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

	@Override
	public void run() {

		try {

			while(true) { // 대화가 언제 끝날지 몰라서 while 문 사용 	
				byte[] buffer =new byte[512];

				DatagramPacket dp=new DatagramPacket(buffer, buffer.length);

				ms.receive(dp);
				String str= new String(dp.getData()).trim();
				ta.append(str+"\r\n");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
			disConnect();
		}

	}

}

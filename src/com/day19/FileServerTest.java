package com.day19;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServerTest {
	// 클래스 안 클래스 
	class  WorkThread extends Thread{

		private Socket sc = null;

		public WorkThread(Socket sc) {
			this.sc =sc;	
		}
		@Override
		public void run() { //파일 읽어내기

			try {
				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
				System.out.println(sc.getInetAddress().getAddress()+"접속..."); // ip 받아냄. 

				FileOutputStream fos= null; // 왜쓰지 
				Object ob =null; 

				while((ob=ois.readObject())!=null) {
					FileInfo info = (FileInfo) ob; // down cast

					if(info.getCode()==100) { // 파일 전송 (파일명 전송)

						String str = new String(info.getData());
						fos= new FileOutputStream(str);

						System.out.println(str+" 파일 전송 시작 !");

					}else if(info.getCode()==110) { // 데이터 전송 

						if(fos==null) { // 파일전송됐는지 확인
							break;
						}

						fos.write(info.getData(),0,info.getSize());
						System.out.println(info.getSize()+" byte 받는 중 ... ");

					}else if(info.getCode()==200) {// 파일 전송 끝. 
						if(fos==null) {
							break;
						}
						String str=new String(info.getData());

						fos.close();
						System.out.println("파일 전송 끝 ! ");
					}
				}

			} catch (Exception e) {
				System.out.println(e.toString());	
			}			
		}
	}

	public void serverStart() {

		try {

			ServerSocket ss= new ServerSocket(7777);
			System.out.println("클라이언트 접속 대기 중 ... ");

			Socket sc= ss.accept();
			WorkThread th= new WorkThread(sc);
			th.start(); // run 으로 간다. 

		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}

	public static void main(String[] args) {
		new FileServerTest().serverStart();

	}

}

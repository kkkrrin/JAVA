package com.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerTest2 {

	private List<Socket> clients = new ArrayList<Socket>();

	public void serverStart() {
		try {

			ServerSocket ss= new ServerSocket(7777);
			System.out.println("Server start .. ");

			while(true) {
				Socket sc = ss.accept();
				WorkerThread wt= new WorkerThread(sc);
				wt.start();



			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	class WorkerThread extends Thread {

		private Socket sc;

		public WorkerThread(Socket sc) {
			this.sc=sc;
		}

		@Override
		public void run() {
			String ip = null;
			String msg=null;

			try {

				BufferedReader br= new BufferedReader(new InputStreamReader(sc.getInputStream()));
				ip = sc.getInetAddress().getHostAddress();
				clients.add(sc);

				msg="["+ip+"] 입장을 했습니다.";
				for(Socket s : clients) {

					if(s==sc) {
						continue; // 이번만 통과
					}

					PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
					pw.println(msg);

				}

				while((msg=br.readLine())!=null) {
					for(Socket s : clients) {

						if(s==sc) {
							continue; // 이번만 통과
						}

						PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);

					}

				}


			} catch (Exception e) {
				msg="["+ip+ "]" + "퇴장했습니다.";

				try {

					for(Socket s : clients) {

						if(s==sc) {
							continue; // 이번만 통과
						}

						PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);

					}

					sc=null;


				} catch (Exception e2) {
					// TODO: handle exception
				}

			}

		}

	}

	public static void main(String[] args) {
		new ServerTest2().serverStart();

	}

}

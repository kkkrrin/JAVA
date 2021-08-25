package com.day18;
//network

import java.net.InetAddress;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String host;
		System.out.print(" 호스트 [www.naver.com] : ");
		host= sc.next(); 
		
		try {
			InetAddress ia = InetAddress.getByName(host); // ip 관리해주는
			System.out.println("ip 주소 : "+ia.getHostAddress());
			System.out.println("호스트 : "+ia.getHostName());
			
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}

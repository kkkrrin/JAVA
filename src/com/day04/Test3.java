package com.day04;

public class Test3 {

	public static void main(String[] args) {
		
		int n,s;
		s=0;
		//100까지의 합, 
		for(n=1;n<=100;n++){
			s=s+n;//s+=n;
			
		}
		System.out.println(s);

		
		s=0;
				
		//홀수의 합
		for(n=1;n<=100;n+=2) {
			s=s+n;
		}
		
		System.out.println(s);
		s=0;
		
		//짝수의 합
		for(n=2;n<=100;n+=2) {
			s=s+n;
		}
		System.out.println(s);
		
		s=0;
		//3의 배수 합
		for(n=3;n<=100;n+=3) {
			s=s+n;
		}
		
		System.out.println(s);

	}

}

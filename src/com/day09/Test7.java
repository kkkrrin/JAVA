package com.day09;
//StringBuffer : 느림 : 동기화 지원 함 
//StringBuilder : 빠름 : 동기화 지원 안함. 

public class Test7 {
	
	public void stringTime() {
		
		System.out.println("String...");
		// 시간 재기 
		//long start=System.currentTimeMillis(); 
		long start=System.nanoTime();
		
		String str="A";
		
		for(int i=0;i<50000;i++) {
			str+="A";
		}
		
		long end = System.nanoTime();
		System.out.println("실행시간:"+(end-start));
		
	}
	
	
	public void stringBufferTime() {
		
		System.out.println("StringBuffer...");
		
		long start=System.nanoTime();
		
		StringBuffer str =new StringBuffer("A");
		
		for(int i=0;i<50000;i++) {
			str.append("A");  // append = 누

		}
		long end = System.nanoTime();
		System.out.println("실행시간:"+(end-start));
		
	}
	
public void stringBuilderTime() {
		
		System.out.println("StringBuilder...");
		
		long start=System.nanoTime();
		
		StringBuilder str =new StringBuilder("A");
		
		for(int i=0;i<50000;i++) {
			str.append("A");  // append = 누적 

		}
		long end = System.nanoTime();
		System.out.println("실행시간:"+(end-start));
		
	}

	public static void main(String[] args) {
		
		Test7 ob=new Test7();
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
	}

}

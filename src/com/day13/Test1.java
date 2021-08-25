package com.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String>lists = new ArrayList<>();
		
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		Iterator<String> it1=lists.iterator();
		while(it1.hasNext()) {
			String str=it1.next();
			System.out.print(str+" ");
			
		}
		
		System.out.println("\n---------------------");
		// 출력이 안됨 : iterator 는 한번 출력한건 다시 출력안됨. (1회성)  다시 출력하려면 아이티 생성 다시 해줘함. 
		// ListIterator 는 그럴 필요 없음. ( 하지만 그냥 Iterator 를  많이 쓰나봄 ) 
		
		while(it1.hasNext()) { 
			String str=it1.next();
			System.out.print(str+" ");
			
		}
		
		System.out.println("\n---------------------");

		
		ListIterator<String> it2 =lists.listIterator(); // 위 iterator 랑 같음. List의 Iterator  얘는 역순 빼오기도 가능 
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");  // 위에 print 문 함축. 
		}
		
		System.out.println("\n---------------------");
		
//		while(it2.hasPrevious()) {
//			System.out.print(it2.hasPrevious() + " ");   // 역방향으로 뺴오기.  왜 오류나지 true 무한으로나옴. 
//		}
		
		
		List<String> lists1 = new ArrayList<>(); // 배열안에 배열이 들어가는게 아니라, 배열 갯수가늘어나서 들어가게됨. 
		lists1.addAll(lists);
		lists1.add("인천");
		
		for( String s : lists1) {
			System.out.print(s+" ");
		}
		

		
		
		
		
	}
}

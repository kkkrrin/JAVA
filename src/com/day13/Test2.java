package com.day13;
// Collection - Map<key,value>

import java.util.Hashtable;
import java.util.Iterator;

//Map (I) - HashTable (C)  - vector 와 동일 ( 동기화 제공해서조금 느림) 
//Map (I) - Hash Map (C) - arrayList 와 동일 ( 동기화 제공 x 빠름 ) 

//Key는 중복값을 가질 수 없다. (Key의 자료형-> Set  , Set 은 중복값을 가질 수 없다.) 
//Map은 Iterator 가 없다. 
// set ( map이 갖는 속성이(key)) 은 이터레이터를 갖고 있기때문에, 빌려쓰는 개념으로 map에서도 이터레이터를 쓸 수 있다.
// map / set 은 별개의 컬렉션임. 

public class Test2 {
	
	public static final String name []=
		{"이예린","배수지","아이유","또누가","있지"};  // value

	public static final String tel []=
		{"111-111","222-222","333-333","222-222","555-666"}; //key 
	

	public static void main(String[] args) {
		
		Hashtable<String,String> h =new Hashtable<String, String>();
		
		for(int i=0 ; i< name.length; i++) {
			h.put(tel[i], name[i]); 		//데이터집어넣기. h.put(key, value); 형태. 
		}
		
		System.out.println(h); // 자기 방법대로 출력함. (나름) 키가 같으면 알아서 수정해서 출력함. 
	
		String str;
		str=h.get("111-111") ; // key 값을 주면 value 받아온다. 
		
		System.out.println(str);

		// 키가 존재하는지 검사.
		if(h.containsKey("222-222")) {
			System.out.println("222-222있음.");
		}
		
		// 데이터(value) 존재하는지 검사
		if(h.contains("이예린")) {
			System.out.println("이에린 있음.");
		}
		
		Iterator<String> it =h.keySet().iterator(); // iterator 사용하기. ( key의 iterator) 
		
		while(it.hasNext()) { // map 에 없는 iterator 사용하기. 
			String key =it.next(); // key 를 읽어옴.
			String value = h.get(key); 
			
			System.out.println(key+":"+value);
		}
		
		
	}

}

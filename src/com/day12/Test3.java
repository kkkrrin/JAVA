package com.day12;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Test3 {

	private static final String city []= {"서울","부산","대구","인천","광주","대전","울산"};

	public static void main(String[] args) {

		Vector<String> v =new Vector<String>();

		String str;

		System.out.println("초기 사이즈  : "+v.capacity()); //10 벡터가 공간을 만든다. 

		for(String s : city) {
			v.add(s);
		}

		for(String s: v) { // 확장 for 문. 
			System.out.print(s+" ");
		}

		System.out.println();

		//수정 ( 넣는다 ) 
		v.set(0, "Seoul"); // set : 내용 바꾸기. 
		v.set(1, "Pusan");

		for(String s: v) { 
			System.out.print(s+" ");
		}

		System.out.println();

		v.insertElementAt("대한민국", 0); // 삽입 -나머지 뒤로 밀림. ( 끼워넣기)

		for(String s: v) { 
			System.out.print(s+" ");
		}
		System.out.println();

		// 인덱스 검색. 
		int index = v.indexOf("대구"); // 대구가 있는 인덱스 번호를 반환, 없으면 -1 값 반환. 

		System.out.println(index);

		// 정렬(오름차순 1,2,3, ㄱㄴㄷㄹ) 
		Collections.sort(v); // 알파벳 -> ㄱ,ㄴ,ㄷ 순으로 정렬된다. 

		for(String s: v) { 
			System.out.print(s+" ");
		}
		
		System.out.println();

		// 정렬(내림차순 1,2,3, ㄱㄴㄷㄹ) 
		Collections.sort(v,Collections.reverseOrder());   // v, 점 아님. 

		for(String s: v) { 
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		// 삭제
		v.remove("Pusan"); // v.remove(7) 
		
		for(String s: v) { 
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		// 용량 자동증가
		
		for(int i=0; i<20; i++) {
			v.add(Integer.toString(i)); // Warrper class 사용 해서 tostring 으로 변경'
			}
		for(String s: v) { 
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println(" 증가 사이즈 : "+v.capacity()); //40
		// 대략 7~9개 정도가 생기면 자동으로 10으로 생성됨. 총27 데이터가 있어서 10개씩해서 40이됨.
		//------------------------
		
		// 범위 삭제 
		for(int i=1;i<=10;i++) {
			v.remove(5); //5자리만 10번 삭제하면 대구랑 8이 만나게된다. 
		}
		
		for(String s: v) { 
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println(" 벡터  사이즈 : "+v.capacity());//40
		
		System.out.println("---------------------------- v.trimToSize() 빈공간제거 실행");
		// 비어있는 벡터 공간 삭제
		v.trimToSize();
		System.out.println("데이터의 갯수: "+v.size());
		System.out.println("벡터 사이즈 : "+v.capacity());
		
		System.out.println("---------------------------- v.clear() 모든데이터 삭제 실행");

		// 벡터 안 모든 데이터 삭제
		v.clear();
		System.out.println("데이터의 갯수: "+v.size()); //0
		System.out.println("벡터 사이즈 : "+v.capacity()); //17


	}

}

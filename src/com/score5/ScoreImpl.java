package com.score5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap= new HashMap<String, ScoreVO>(); // Strinig: hak타입, 데이터 : ScoreVO
	//private Map<String,ScoreVO> hMap = new TreeMap<String,ScoreVO>(); //  hashtable 쓰던, 상관없음 

	Scanner sc =new Scanner(System.in);
	String hak ; // key 의 역할. 

	@Override
	public void input() {

		// 학번을 검사 한 후에 객체를 생성해줘야한다. 
		System.out.print(" 학번 : ");
		hak=sc.next();
		if(searchHak(hak)) {
			System.out.println("학번이 존재합니다. 추가 실패 !!");
			return; 
		}

		// 학번이 존재하지않는다면 ? 

		ScoreVO vo = new ScoreVO(); // 객체생성 

		System.out.print("이름: "); 
		vo.setName(sc.next());

		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수: ");
		vo.setMath(sc.nextInt());

		hMap.put(hak, vo); 
		System.out.println("추가 성공 !!");		
	}

	@Override
	public boolean searchHak(String hak) {

		if(hMap.containsKey(hak)) // 받아온 키 값이 존재하는지, 안하는지에따라 return값 돌려받음.있-T, 없-F
			return true;
		return false;
		// return hMap.containsKey(hak); -> 있-T, 없-F  위에 함축 가능. 
	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			String hak = it.next(); 
			ScoreVO vo = hMap.get(hak); // 키 주면 value 값 준다.

			System.out.println(hak+" "+vo.toString());
		}				
	}

	@Override
	public void delete() {
		
		System.out.print("삭제할 학번 : ");
		hak=sc.next();

		if(searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("학번 삭제 성공 !! ");
				} else {
					System.out.println("학번이 존재하지 않습니다. 삭제 실패 !! ");
				}
		}

	@Override
	public void update() {

		System.out.print("점수를 수정할 학번을 입력하세요 :");
		hak =sc.next();
		
		if(!searchHak(hak)) { // 학번이 있으면 수정, 없으면 안해. ( 역으로 바꿔서 ! 넣어 하기)
			System.out.println(" 학번이 존재하지 않습니다. 수정 실패 !!");
			return ;  // (밑에 실행 안함) 
		}
		
		ScoreVO vo = hMap.get(hak);
		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수: ");
		vo.setMath(sc.nextInt());
		
		//hmap.put 안해주고 그냥 덮어쓰기 가능. 
		System.out.println("수정 성공 !!");
		
	}

	@Override
	public void findHak() {
		System.out.print(" 학번 검색 :");
		String hak = sc.next();

		if(!searchHak(hak)) {
			System.out.println("학번이 존재하지 않습니다. 검색실패 !!");
			return ;
		}
		ScoreVO vo=hMap.get(hak);
		System.out.println(hak+ " "+ vo.toString());

	}

	@Override
	public void findName() {
		System.out.print("이름검색:");
		String name=sc.next();

		Iterator<String> it =hMap.keySet().iterator();
		boolean flag = false;

		while(it.hasNext()) {
			String hak=it.next();
			ScoreVO vo= hMap.get(hak);

			if(vo.getName().equals(name)) { // 동명이인 찾음. 
				System.out.println(hak+" "+vo.toString());
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("이름이 존재하지 않습니다. 검색 실패 !!");
		}

	}
}

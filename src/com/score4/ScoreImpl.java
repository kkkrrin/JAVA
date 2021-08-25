package com.score4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{

	private List<ScoreVO> lists = new ArrayList<ScoreVO>(); // 파일철에 뭐 넣어 scorevo 넣을거야.

	Scanner sc= new Scanner(System.in);

	@Override
	public int input() { // 사용자에게 데이터 묻기 반환값int 만들어 놓은 이유는 나중에 DB 쓸때, 지금 상관 없음.
		int result=0;

		ScoreVO vo= new ScoreVO();
		System.out.print("학번 : "); //111
		vo.setHak(sc.next());  //111 을 매개변수로 setHak 에 넣어준다. 

		System.out.print("이름: "); 
		vo.setName(sc.next());

		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수: ");
		vo.setMath(sc.nextInt());

		lists.add(vo);

		return result;
	}

	@Override
	public void searchHak() { //hak  비교 

		System.out.print("검색할 학번 : ");
		String hak= sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while(it.hasNext()) {

			ScoreVO vo= it.next();
			if(vo.getHak().equals(hak)) { // string은 equals 를 사용해서 비교해야됨. 
				System.out.println(vo.toString());
				break;
			}
		}
	}


	@Override
	public void searchName() {
		System.out.print("검색할 이름  : ");
		String name= sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while(it.hasNext()) {

			ScoreVO vo= it.next();
			if(name.equals(vo.getName())) { // string은 equals 를 사용해서 비교해야됨. 
				System.out.println(vo.toString());
				//break;  - 이름 검색에선 없애야한다. 
			}
		}
	}


	@Override
	public void print() {

		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			ScoreVO vo= it.next();
			System.out.println(vo.toString());
			
		}
	}



	@Override
	public void descSortTot() { // 내림 desc 정렬 
		Comparator<ScoreVO> comp= new Comparator<ScoreVO>() { // 무명의 클래스 ( 내부) 

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
								return vo1.getTot() < vo2.getTot() ? 1 : -1; // 공식  부등로호 오름차순, 내림차순 만들 수 있음. 
			} 			
		};
		
		Collections.sort(lists, comp); // lists 에 있는걸 comp 에 있는 방법으로 ( 실제정렬이 이뤄지는 부분) 
		print(); // Iterator 호출. 
		
	}

	@Override
	public void ascSortHak() { // 학번 오름차순 정렬
		Comparator<ScoreVO> comp= new Comparator<ScoreVO>() { // 무명의 클래스 ( 내부) 

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
								return vo1.getHak().compareTo(vo2.getHak()); // string이라 부등호 안씀. 정렬이랑 다르다. 
			} 			// vo1, vo2 위치를 바꾸면 내림차순으로 정렬된다. 
		};
		
		Collections.sort(lists, comp); // lists 에 있는걸 comp 에 있는 방법으로 ( 실제정렬이 이뤄지는 부분) 
		print(); // Iterator 호출. 
		
	}
}


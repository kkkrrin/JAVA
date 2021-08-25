package com.score4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl2 implements Score2 {

	private List<ScoreVO2> lists = new ArrayList<ScoreVO2>();
	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {
		int result=0;

		ScoreVO2 vo = new ScoreVO2(); 

		System.out.print(" 이름 :");
		vo.setName(sc.next());

		System.out.print(" 학번 : ");
		vo.setHak(sc.next());

		System.out.print(" 국어 점수 :");
		vo.setKor(sc.nextInt());

		System.out.print(" 영어 점수 :");
		vo.setEng(sc.nextInt());

		System.out.println("수학 점수:");
		vo.setMath(sc.nextInt());

		lists.add(vo);

		return result;
	}

	@Override
	public void searchHak() {

	}

	@Override
	public void searchName() {

	}

	@Override
	public void print() {

		Iterator<ScoreVO2> it = lists.iterator();
		while(it.hasNext()) {
			ScoreVO2 vo =it.next();
			System.out.println(vo.toString());
		}
		
	}
}

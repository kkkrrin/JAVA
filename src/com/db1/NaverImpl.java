package com.db1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import com.score4.ScoreVO;

public class NaverImpl implements Naver{

	private ArrayList<NaverVO> lists = new ArrayList<NaverVO>();

	Scanner sc= new Scanner(System.in);



	@Override
	public void input() {

		NaverVO vo=new NaverVO();
		NaverAuthen auth =new NaverAuthen();
		String id; 


		System.out.print("아이디를 입력하세요 : ");
		//id=sc.next();
		//		vo.setId(id);
		vo.setId(sc.next());
		
		id=vo.getId();
		//inputFormat(id); 
				

		System.out.print("비밀번호를 입력하세요 [8~15자 이내]: ");
		vo.setPw(sc.next());

		System.out.print("비밀번호 재확인 :");
		vo.setPw(sc.next());		

		System.out.print("이름을 입력하세요:");
		vo.setName(sc.next());

		System.out.print(" 성별을 입력하세요 : ");
		vo.setGender(sc.next());

		System.out.print(" 생년월일을 입력하세요 [20210722]:");
		vo.setBirth(sc.next());

		System.out.print(" 이메일을 입력하세요 : ");
		vo.setMail(sc.next());

		System.out.print(" 연락처를 입력하세요 :");
		vo.setTel(sc.next());

		lists.add(vo);

	}


	@Override
	public void print() {

		ListIterator<NaverVO> it= lists.listIterator();
		while(it.hasNext()) {
			NaverVO vo=it.next();
			System.out.println(vo.toString());
		}
	}


	@Override
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();

		ListIterator<NaverVO> it= lists.listIterator();
		while(it.hasNext()) {
			NaverVO vo=it.next();
			if(vo.getId().equals(id)) {
				System.out.println(vo.toString()+"\n아이디 검색 성공 !!");

				break;

			}

		}
	}
}

package com.day16;
//직렬화에 대한. 

import java.io.Serializable;

public class MyDataVO implements Serializable { // 직렬화 (메소드 없음) 
	private String name;
	private int score;
	private transient String pwd; // file에 저장하지 말라는 명령어 = transient 
	 
	public MyDataVO(String name, int score,String pwd) { // 생성자 만들어서 초기화한다. ( 게터세터 안씀 ) 
		this.name=name;
		this.score=score;
		this.pwd = pwd;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() { // 전체 데이터 출력하기 
		return  name + " : " + score+ " : " +pwd;
	}
	
	
}

package com.score4;
// 데이터 저장
// 이름, 학점, 국영수 받아서 총점/평균 구하기. 


public class ScoreVO2 {
	private String hak;
	private String name;
	private int kor, eng,math;
	private float tot;
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public float getTot() {
		return tot;
	}
	public void setTot(float tot) {
		this.tot = tot;
	} 
	

}

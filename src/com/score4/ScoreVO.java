package com.score4;
// 데이터가 저장되는 곳. 

public class ScoreVO { //Value Object : DB를 사용하지않고 데이터를 저장하는 
	
	private String hak;
	private String name;
	private int kor; 
	private int eng;
	private int math;
	private float tot; // 놓침 
	
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

	public int getTot() {
		return kor+eng+math;
	}
	
	@Override
		public String toString() { // object 꺼 오버라이드 ( 출력 더러워서만들어주는 부분) 
		 String str = String.format("%5s %6s, %4s %4d %4d %4d %5.1f",
				 hak,name,kor,eng,math,getTot(),getTot()/3.0);

			 return str;
		}
	

}
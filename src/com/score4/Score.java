package com.score4;

public interface Score {
	public int input();
	public void print();
	public void searchHak(); //impl 가서 오버라이드 해줘야 되는 강제성 
	public void searchName();
	//public void deleteHak(); // 학번선택시 지워지는 거 만들기. 
	public void descSortTot();
	public void ascSortHak();

}

package com.score5;

public interface Score {
	
	public void input();
	public boolean searchHak(String hak); // hak을 매개변수로 준다. 학번 존재유무 검사. 
	public void print();
	public void delete(); //삭제  remove 
	public void update(); // 수정 
	public void findHak();
	public void findName(); 
	
}

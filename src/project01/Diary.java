package project01;

public interface Diary {
	
	public void join();
	public void print(); // 확인용
	public void writeFile();
	public void endprint(); //종료시 나오는 이미
	
	public boolean checkId(String id); // id 중복 
	public boolean checkCid(String id); // id 조건 확인 (c - condition)
	public boolean checkPw(String pw1,String pw2); 
	public boolean checkMail(String mail);
	public boolean checkTel(String tel);
	public boolean checkBirth(String birth);
	
	
	
	
	
	

}

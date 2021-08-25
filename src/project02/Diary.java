package project02;

public interface Diary {
	
	public void join();
	public void print(); // 확인용
	public void writeFile();
	
	public boolean checkId(String id); // id 중복 
	public boolean checkCid(String id); // id 조건 확인 (c - condition)
	public boolean checkPw(String pw1,String pw2); 
	public boolean checkMail(String mail);
	public boolean checkTel(String tel);
	public boolean checkBirth(String birth);
	
	/*public void login();
	public void myidpage(String loginid);
	public void checkcontent(String loginid);
	public void writeContent(String loginid);
	public void mytitlecheck(String loginid);
	public void showlist(String loginid);*/
	
	
	
	
	
	

}

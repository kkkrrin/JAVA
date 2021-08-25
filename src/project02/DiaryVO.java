package project02;

import java.io.Serializable;

public class DiaryVO implements Serializable{
	
	private String id;
	private String pw;
	private String birth;
	private String name;
	private String mail;
	private String tel;
	
	
	public String getId() {
		
		return id;
		
	}
	public void setId(String id) {
		
		this.id = id;
		
	}
	public String getPw() {
		
		return pw;
		
	}
	public void setPw(String pw) {
		
		this.pw = pw;
		
	}
	public String getBirth() {
		
		return birth;
		
	}
	public void setBirth(String birth) {
		
		this.birth = birth;
		
	}
	public String getName() {
		
		return name;
		
	}
	public void setName(String name) {
		
		this.name = name;
		
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		String str; 
		
		str=String.format("%3s, %3s,%3s,%3s,%3s,%3s", name,id,birth,pw,tel,mail);
				return str;
				}


}

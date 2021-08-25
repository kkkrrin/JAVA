package com.score5;

public class NaverVO {
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birth;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
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
	
	public String toString() {
		
		String str; 
		str= String.format("ID : %s  PW: %3s \n NAME: %s GENDER: %s BIRTH: %3s \n MAIL: %s TEL :%2s\n", 
				id,pw,name,gender,birth,mail,tel);
		return str;
	}
	

}

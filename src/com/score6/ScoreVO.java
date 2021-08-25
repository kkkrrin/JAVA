package com.score6;

import java.io.Serializable;

public class ScoreVO implements Serializable {

	private String name;
	private String birth;
	private String score;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	@Override
	public String toString() {
				return "    "+ name+"    "+birth+"    "+score+"\n";
	}


}

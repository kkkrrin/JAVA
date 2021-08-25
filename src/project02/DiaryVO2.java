package project02;

import java.io.Serializable;

public class DiaryVO2 implements Serializable{
	
	private String diary;

	public String getDiary() {
		return diary;
	}

	public void setDiary(String diary) {
		this.diary = diary;
	}
	
	@Override
	
	public String toString() {
		String str;
		str = String.format("%s", diary);
		return str;
	
	}
	
}

package com.day19;

import java.io.Serializable;

public class FileInfo implements Serializable{ // 직렬화해야됨. 
	/*
	 사용자 정의  통신규약 (내가 정하는)  
	code:
	 		100 : 파일전송 시작. (파일명 전송)
	 		110 : 파일내용 전송. 
	 		200 : 파일전송 종료. (파일명 전송) 
	size : 전송 길이 (크기) 
 	data: 전송 내용  
	 */
	private int code;
	private int size;
	private byte [] data = new byte[1024];
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
}

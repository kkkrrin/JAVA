package com.db1;

public class NaverAuthen {

	public void inputFormat(String str) throws Exception{

		if(str.length()<8||str.length()>15) {
			throw new Exception("문자열의 길이는 5~10자 입니다.");	
		}

		int eng =0;
		int num=0;
		//카운트 용
		
		for(int i=0;i<str.length();i++) {
			// 문자열에서하나 씩 빼와서 비교해야됨.
			char ch =str.charAt(i);
			
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) { //영문 
				eng++;
			}else if(ch>='0'&&ch<='9') { // 숫자
				num++;
			}
		}
		
		if(eng==0||num==0)
			throw new Exception("영문자,숫자 혼용해서 입력해야합니다.");
	}
}
	

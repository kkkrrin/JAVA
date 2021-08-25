package com.day14;
// 검증 작업 

public class OperAuthen {
	
	public void inputFormat(String str) throws AuthenException{

		String tmp []=str.split(","); // 쉼표로 데이터 구분

		if(tmp.length!=2) {
			throw new AuthenException("숫자 입력 형식 오류 :"+str);

		}
	}

	@SuppressWarnings("unused")// 검사만하고 변수를 쓰지 않으니까 경고문 발생. ( 경고문 처리) 
	public void number(String str) throws AuthenException{  
		try {

			if(str.indexOf(".")!=-1) { // 20.5 -> . 이 있으면 실수.
				double num = Double.parseDouble(str);
			} else { // . 없음 -> 정수
				int num= Integer.parseInt(str);
			}

		} catch (NumberFormatException e) {
			throw new AuthenException("숫자 입력 불가 : "+str);

		}

	}


	public void operator(char ch) throws AuthenException{ //연산자 검사. 
		switch(ch) {
		case '+': case '-' : case '*': case '/' :
			return;
		default :
			throw new AuthenException("연산자 오류  : " + ch);
		}
	}




}

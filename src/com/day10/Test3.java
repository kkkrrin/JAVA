package com.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//string method 로만 계산기 만들기 

public class Test3 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("수식 [34+56] : "); //34+56
		String str = br.readLine(); // 예외처리

		str=str.replaceAll("\\s", " "); //공백 제거 

		//	String oper[] = {"+","*","-","/"};	
		//`for(String op: oper) {}
		// 위 두 줄 한 줄로 만들기. 

		for(String op : new String [] {"+","*","-","/"}	 ) {
			int pos = str.indexOf(op);

			if(pos >-1) {
				//341+56 읽어들이는 방법 같은디 
				int num1=Integer.parseInt(str.substring(0,pos));
				int num2=Integer.parseInt(str.substring(pos+1)); // 이해 몬함. 

				int result  =0;

				char oper = str.charAt(pos); // indexat- index number , charat-char 값. 

				switch (oper) {
				case '+':
					result=num1+num2; break;

				case '-':
					result=num1-num2; break;

				case '*':
					result=num1*num2; break;

				case '/':
					result=num1/num2; break;

				}

				String s= String.format("%d %c %d= %d", num1, oper,num2,result);
				// printf 랑 같은데, format은 출력을 하는게 아니라 s 변수에 값을 넣는 것. 
				// 출력은원하는 곳에 출력하면 된다. (return 값으로 출력하는데 종종쓴다) 

				System.out.println(s);


			}

		}

	}

}

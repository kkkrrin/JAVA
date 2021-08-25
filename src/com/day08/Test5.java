package com.day08;
//비정형 인수 =  인수의 갯수를 정하지 않는 것. 

public class Test5 {

	public 	int  sum (int...args)  { //args 사용자 정의 ?
		int  s= 0;

		for (int i=0; i<args.length; i++) {
			s+=args[i]; //합계 
		}
		return s;
	}

	public static void main(String[] args) {
		Test5 ob = new Test5();
		int result; 
		result= ob.sum(2,4,6,8,10);
		System.out.println(result);

		result = ob.sum(1,3,5,7,9,11,15,17,19);
		System.out.println(result);
	}

}

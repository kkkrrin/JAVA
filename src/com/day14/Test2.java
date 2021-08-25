package com.day14;
// 예외처리 exception - try catch 

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int num1, num2, result;
		String oper;

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("두 개의 정수 입력하세요 : ");
			num1=sc.nextInt();
			num2=sc.nextInt();

			System.out.print("연산자 : ");
			oper= sc.next();

			result = 0;
			if(oper.equals("+"))
				result = num1+num2;
			else if(oper.equals("-"))
				result = num1-num2;
			else if(oper.equals("/"))
				result = num1/num2;
			else if(oper.equals("*"))
				result = num1*num2;

			System.out.printf("%d %s %d = %d \n", num1, oper,num2, result);

		} catch (ArithmeticException e) { // 연산 에러처리?

			System.out.println("0으로 나눌 수 없다 !");

		} catch (Exception e) {  // 사장( 가장큰 클래스) 
			// exception : e 에 저장.
			//System.out.println(e.toString()); // 부모 tostirng 오버라이드. 간단하게 오류출력 
			//e.printStackTrace(); .// 오류 상세 출력
			//Exception : ?

			System.out.println("숫자가 아닙니다.");


		} finally { // 잘 안씀.  무조건 실행되는 것 
			System.out.println("나 항상 보인다..?");
		}

	}

}

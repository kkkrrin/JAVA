package com.day06;

import java.util.Scanner;

public class Rect {
	//붕어빵 틀을 만드는 것 ( 양식을 만드는 작업 공간) 
	// Test5+Rect 
	
	int w, h; // Instance 변수 (전역 변수) 
	
	public void input() {
		//input 이라는 부서 ()매개변수 필요없고, 나갈때 void 아무것도 반환하지 않음

		//int w, h; //Local 변수 (선언할 경우 area에서 사용 할 수 없기때문에 전역 변수로 선언한다.) 
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 값 : ");
		w= sc.nextInt();
		System.out.print("세로 값: ");
		h=sc.nextInt();

		//return; //반환값 없음.  return 생략 가능 (void의 경우)

	}
	
	public int area () {
		
		int result; //Local 변수 
		
		result = w*h;
		
		return result;
		
		
	}
	
	public int length() { // 둘레 : 가로*세로*2
		return (w+h)*2; //  연산이 간단할 경우 새로운 변수 생성하지 않고 return 문으로 해결한다. 
		
	}
	
	public void print(int a,int l) {  
		System.out.println("가로 값 :"+w);
		System.out.println("세로 값 :"+h);
		System.out.println("넓이 값 :"+a);
		System.out.println("둘레 값: "+l);
	}

}

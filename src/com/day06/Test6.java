package com.day06;

import java.util.Scanner;
// 클래스 안에 클래스 만들기. / Test5-Rect 처럼  따로 만들지 않는 것. 

class Hap{
	 int su, sum; //Instance 변수 
	 public void input() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 입력: ");
		 su=sc.nextInt();
	 }

	 public int cnt() {
		for(int i=1;i<=su;i++) {
			sum+=i; //sum 초기화를 하지 않았는데 오류가 없다? -> instance변수는 선언만하면 0으로 초기화된다.( 알맞은 값이 이미 존재한다) 
							//지역변수는 전역변수처럼 초기화 처리가 되지 않는다.  
		}
		return sum;
	 }
	 
	 public void print(int i) { // int sum 의 경우 같은 이름이지만, 메소드가 다르기때문에 문제없다. 
		 System.out.println("합계:"+i);
	 }
}

public class Test6 {

	public static void main(String[] args) {
	Hap h= new Hap();
	h.input();
	int i=h.cnt();
	h.print(i);
		
	}

}

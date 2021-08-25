package com.day07;
//사용자에게 반지름을 입력받아 면적, 둘레 구하기 

import java.util.Scanner;

class Circle{ // 괄호 조심 
		// 클래스 안에 클래스 이름을 쓸 수 없어서 대명사를 사용한다 = this,

	private int r; // private 사용하기 위해 우회도로를 만들어야 한다. (메소드를 이용한다) 

	public void setData(int a) {// a= 반지름
		r= a;
		//this.r=a; 
	}

	public double area() {
		return r*r*3.14; 
		//retun this.r*this.r*3.14; ( 명확할 경우 생략가능)
	}

	public void print(double a) { // area 의 return 값 a 로 받는다.
		System.out.println("반지름:"+r);
		System.out.println("넓이 : "+a);

	}
}

public class Test2 {
	public static void main(String[] args) {
		Circle ob =new Circle();
		
		ob.setData(20); 				// setData(20,ob)  (넘기는값 , 주소)
		double a= ob.area();		//od.area(ob) 
		ob.print(a);
	}
}

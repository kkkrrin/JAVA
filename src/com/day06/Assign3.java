package com.day06;

import java.util.Scanner;

// 클래스 안에 클래스 만들기 
// 틀을 만들어 작업하는 공간
class Exchange{
	int num [] =new int [5];
	int tmp;

	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요 : ");
		for(int i=0;i<=5;i++) {
		num[i]=sc.nextInt();
		}
	}
	
	public int sort() {
		
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}
		
		return num[5];		
	}
	
	public void print(int result) {
		System.out.println("sorted data : "+result);
	}
}

public class Assign3 {
	public static void main(String[] args) {
		Exchange as=new Exchange();
		as.input();
		int result=as.sort();
		as.print(result);

	}

}

// 실행이 안되는데 배열을 반환하는 방법때문인가 잘 모르겟음. 

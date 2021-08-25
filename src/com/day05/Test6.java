package com.day05;

import java.util.Random;

public class Test6 {

	public static void main(String[] args) {
		//1~45까지의 수 중 6개의 난수를 발생시켜 크기 순으로 정렬 

		Random rd = new Random(); // 랜덤 함수 
		int num[]=new int[6];

		int i,j,su, tmp;

		//random함수는 0부터 계산된다.
		su =0;
		while (su<6){ // su 0으로 초기화했으니까 su<6
			num[su]=rd.nextInt(45)+1; //0~44 로 가져오기 때문에 +1

			for(i=0;i<su;i++) { //중복된 난수 발생 방지 
				if(num[i]==num[su]) {
					su--;
					break;
				}
			}
			su++;
		}

		// 정렬 

		for(i=0; i<num.length-1;i++) {
			for(j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}

		//출력 
		for(int n : num) { // 확장 for문 
			System.out.printf("%4d",n);
		}
		System.out.println();

	}

}

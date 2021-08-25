package com.day10;

import java.util.Calendar;
import java.util.Date;

// 캘린더 Calender

public class Test5 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance(); 

		int y= now.get(Calendar.YEAR); // 캘린더에서 연도 받아옴.
		int m=now.get(Calendar.MONTH)+1; //월 0~11까지 저장되어있음.+1 넣을땐 -1
		int d=now.get(Calendar.DATE); // 일
		int w=now.get(Calendar.DAY_OF_WEEK); // 주의 수 (1~7 , 일요일 :1)

		String week []= {"일","월","화","수","목","금","토"};
		System.out.println(y+"-"+m+"-"+d+"-"+week[w-1]);

		//달의 시작일과 마지막날. 

		int startDay=now.getActualMinimum(Calendar.DATE); // 매달의 첫 날. ( 사실 1) 
		int endDay=now.getActualMaximum(Calendar.DATE);

		System.out.println(startDay+":"+endDay);

		// printf로 날짜와 시간 출력하기. 
		System.out.printf("%tF \n",now); 
		System.out.printf("%tT \n",now);

		System.out.printf("%1$tF %1$tT \n",now); // 변수 하나로 사용하기 1$

		now.set(2022, 5-1, 12); // 집어넣을때 0부터 인식해서 +1했기 때문에 -1 해준다.
		
		y= now.get(Calendar.YEAR); 
		m=now.get(Calendar.MONTH)+1; 
		d=now.get(Calendar.DATE); 
		w=now.get(Calendar.DAY_OF_WEEK); 

		System.out.println(y+"-"+m+"-"+d+"-"+week[w-1]);
		
		System.out.println(new Date()); // 오늘 날짜. 

	}
}

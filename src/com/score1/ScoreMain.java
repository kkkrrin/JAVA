package com.score1;
//main method 
// score의 메소드를 호출하는 곳 
// Record + Score + ScoreMain 

public class ScoreMain {

	public static void main(String[] args) {
		Score ob = new Score();
		ob.set();
		ob.input();
		//ob.ranking()= private 으로 선언해서 접근 불가. 
		//score.java 의 print 메소드에서 ranking 메소드호출한다. 
		ob.print();
		

	}

}

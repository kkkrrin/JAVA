package com.score3;

public class ScoreMain {

	public static void main(String[] args) {
		
		Score ob = new ScoreImpl(); // scoreImpl 은 본인게 없우니까 그냥 부모 불러도됨
		//Scorelmpl ob = new ScoreImpl();  똑같은거임. 
		
		ob.set();
		ob.input();
		ob.print();
		
		
		
	}

}

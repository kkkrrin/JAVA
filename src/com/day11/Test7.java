package com.day11;
//3. 내부클래스(중첩-static) 

class Outer3{  // new 를 만나야 메모리상에 올라가는데 
	static int a=10;
	int b=20;	
	
	public static class Inner3{ //얘는 static 이라 메모리에 먼저 올라가잇음
		int c=30;
		
		public void write() {
			System.out.println(a);
		//	System.out.println(b); // 메모리상에 안올라가 잇어서 에러. 
			System.out.println(c);

			Outer3 ob =new Outer3(); // Inner3 먼저 메모리상에 올라가잇으니까 객체 생성해준다.
			System.out.println(ob.b); // 메모리 상에 올라가게되면서 정상출력됨. 
		
		}
	}
		
	public void print() {
		Inner3 ob = new Inner3();
		ob.write(); // 위에서이미 했기 댸문에 별 의미는 없음. 
	}
	
	
}


public class Test7 {

	public static void main(String[] args) {
		
		Outer3 out = new Outer3();
		out.print();
		
		Outer3.Inner3 in = new Outer3.Inner3();
		in.write();
		
	}

}

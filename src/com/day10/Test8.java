package com.day10;

// 상속 

class Test{

	protected int a=10, b=20;

	public void write() {
		System.out.println("부모 클래스 write()메소드 ... ");
		System.out.println("a: "+a+",b:"+b);

	}
}
class Demo extends Test{

		protected int b=30, c=40;

		public void print1() {
			System.out.println("자식 클래스 print1()메소드...");
			write(); // 호출 

		}

		public void print2() {
			System.out.println("자식 클래스 print2()메소드...");
			super.write(); // 호출과 같은.. 

		}
		
		public void write() {
			System.out.println("자식 클래스 write()메소드..."); 
//오버라이드. ( 부모도 갖고있고 나도 갖고 있으면 내꺼찍는다) print1에서호출한 write도 내껄 찍는다.
			System.out.println("a:"+a+",b:"+b+",c:"+c);
			System.out.println("super.b :"+ super.b); // 무조건 부모꺼 찍는다. 
			
		}
	}

public class Test8 {

	public static void main(String[] args) {
		
		Demo ob = new Demo();
		
		ob.print1();
		ob.print2();
		
		System.out.println("ob.b: "+ ob.b); // 30 자기 꺼.
		
		// 자식을 부모로 형변환 ( UPCAST) 부모-> 자식 ( downcast )
		System.out.println("((Test)ob).b:" +((Test)ob).b); //-> 부모꺼 20이 찍힌다.  
		// 변수는 형변환해서 부모꺼가 찍히게 가능한데
		// 밑에 메소드는 불가능하다. 
		((Test)ob ).write();  // 자식의 것이 찍힌다. (왜?)	
	}

}

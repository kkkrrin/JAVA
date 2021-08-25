package com.day09;


class SuperC{

	private String title;
	protected double area;

	public SuperC() { 

	} // 기본 생성자 

	public SuperC(String title) { // 오버로딩된 생성자. 
		this.title=title;
	}

	public void write() {
		System.out.println(title + ":" + area);
	}
}

class Circle extends SuperC{ //반지름 받아서 구하기
	private int r;
	protected static final double PI =3.14; // final때문에 PI값은 종료될때까지 변하지 않는다. 상수는 정의를 해줘야한다. 

	public Circle(int r ) {  //오버로딩된 생성자 
		super("원"); // super 찾아가서 원 title 초기화 
		this.r=r;
	}

	public void circleArea() {
		area = r*r*PI;
	}
}

// circle 과 rec 는 같은 부모에게 상속받지만,서로 관련 없는 class 이다. 

class Rec extends SuperC{ // 사각형
	private int w,h;

	public void rectArea(int w,int h) {
		this.w=w;
		this.h=h;
		area=w*h; // 부모 가 프로텍으로 선언 햇기에 바로 넣어줘도됨. 
	}

	@Override // 어노테이션  - 메소드 이름이 바뀌는걸 지켜보고 잇는 ... 
	public void write() {
		System.out.println("가로:"+w+", 세로 :"+h);
		System.out.println("넓이: "+area);
	}

}


public class Test4 {

	public static void main(String[] args) {
		Circle ob1 = new Circle(10); 
		ob1.circleArea();
		ob1.write(); // (부모의 write)

		System.out.println("------------------");
		Rec ob2= new Rec(); // 생성자 생성하면 super 찾아가 
		ob2.rectArea(10, 20);
		ob2.write(); 
		// (자식의 print) 이름을 똑같이 만든 경우 서로 같은 걸 갖고 있기에. 자식 것으로 실행. 
		// 이런경우 오버로딩처럼 무언가 다르게 해주는게 아니라 똑같은 형태로 만들어줘야함. 
		//클래스가 다르기 때문에 이름이나 형태가 같아도 문제가 없다. 
		// 정리 : 상속관계에서 비슷한 작업을 하는 메소드의 이름을 통일시키는 것. 
		// =override 오버라이드. 

	}

}

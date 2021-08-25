package com.day11;
// Interface 
// 1. 추상클래스의 일종이고 선언만 있고 코딩 없다. (내용이 없다) 
// 2. final static변수만 정의할 수 있다. 
// 3. interface 를 구현하기 위해서 implements 를 사용한다.
// 4. 하나 이상의 인터페이스를 구현하게되면, 인터페이스의 모든 메소드를 재정의해야한다.( 오버라이드)
// 5. 인터페이스가 인터페이스를 상속받을 수 있으며, 이때는 extends를 사용한다. 
// 또한 클래스와는 다르게 다중상속 가능. 

interface Fruit{
	// 일반 변수는 선언 할 수 없다.  final 변수만 선언 가능 (상수) 

	String Won="원"; // static,  final , public  생략된 
	//public static final String Won="원"; 

	int getPrice(); //method 
	//public abstract int getPrice();  생략됨. 

	public String getName(); //method  일반메소드 슬수 없어서 선언하고 오버라이드 해야함. 

}

//class FruitImpl implements Fruit //FruitImpl  이런식으로 Impl 를 불여주기도 함. 
class FruitTest implements Fruit{ // 인터페이스 구현. ( 내부적으로는 상속처럼 움직임) 

	// 인터페이스가 갖는 메소드 오버라이드 필수 	
	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	} 

	public String getItems() {
		return "과일";

	}
}


public class Test2 {

	public static void main(String[] args) {
		FruitTest ob1=new FruitTest();
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice()+Fruit.Won);

		Fruit ob2 =ob1; // upcast 가능.

		System.out.println(ob2.getName());
		System.out.println(ob2.getPrice()+Fruit.Won);
		//System.out.println(ob2.getItems()); 부모한테 없으니 에러 (upcast햇으니까 자식거는 자식거)

	}

}

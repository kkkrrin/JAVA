package com.day11;

import java.util.Scanner;

interface FruitA{
	
	String Won="원";
	public int getPrice();
	public String getName();

}

interface ItemFruit extends FruitA{ // 인터페이스 상속받기.
	public String getItems();
	
}


class Orange implements ItemFruit{ //상속받은 인터페이스까지 사용할 수 있음, 총 3개 오버라이드 

	@Override
	public int getPrice() {
				return 1500;
	}

	@Override
	public String getName() {
				return "Orange";
	}

	@Override
	public String getItems() {
				return "Fruit";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
				return 2000;
	}

	@Override
	public String getName() {
				return "Apple";
	}

	@Override
	public String getItems() {
				return "Fruit";
	}
	
}


public class Test4 {
	
	public void packing(ItemFruit ob) { // 인터페이스..

		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice()+ FruitA.Won);
		
	}

	public static void main(String[] args) {
		
		//Orange ob2 = new Orange();
		// 오렌지는 결국  상속받은 걸로만 사용하고 있으니까 밑에처럼 upcast 해줄 수 있다. 

//		ItemFruit ob1 = new Orange(); //upcast
		
//		System.out.println(ob1.getItems());
//		System.out.println(ob1.getName());
//		System.out.println(ob1.getPrice()+ FruitA.Won);
//		
//		
//		ItemFruit ob2 = new Apple();
//		System.out.println(ob2.getItems());
//		System.out.println(ob2.getName());
//		System.out.println(ob2.getPrice()+ FruitA.Won);
		
		ItemFruit ob;

		Test4  t= new Test4();
		
		Scanner sc =new Scanner(System.in);
		System.out.print("1. 오렌지 OR  2. 사과  ");
		
		int n= sc.nextInt();
		if(n==1)
			t.packing(new Orange());
		else 
			t.packing(new Apple());
		
		ob= new Orange(); //upcast

		// packing() 으로 묶기. 
//		System.out.println(ob.getItems());
//		System.out.println(ob.getName());
//		System.out.println(ob.getPrice()+ FruitA.Won);

		System.out.println("---------------------'");
		ob = new Apple();

		
//		System.out.println(ob.getItems());
//		System.out.println(ob.getName());
//		System.out.println(ob.getPrice()+ FruitA.Won);
//		
	}

}

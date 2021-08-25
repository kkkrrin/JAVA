package com.day14;
// 알아만 두라는 내용

//제너릭 
class Box<T>{ //<자료형 T - string?> 
	
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	
	public T get() {
		
		return t;
	}
	
}

public class Test1 {

	public static void main(String[] args) {
			
		Box b1= new Box(); // 데이터 타입 - object ( 자료형을 안줬으니깐) 
		b1.set("seoul "); //upcast

		String str=(String) b1.get(); // 오브젝트가 더 크니깐. 형변환 
		
		System.out.println(str);
		
		b1.set(30);
		
		Integer i=(Integer) b1.get(); // 오브젝트가 더 크니깐. 형변환 
		
		System.out.println(i);
		
		
		Box<String> b2 = new Box<String>(); // String 자료형을 준 경우. 
		b2.set("Pusan");
		str= b2.get();  // 위 str 재사용해서 다운캐스트 안해줘도됨. ! 
		System.out.println(str);
		
		Box<Integer> b3 = new Box();
		b3.set(50);
		
		i=b3.get();// 위 str 재사용해서 다운캐스트 안해줘도됨. ! 
		System.out.println(i);
		
		
		
	}

}

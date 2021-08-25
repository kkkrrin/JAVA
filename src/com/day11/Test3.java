package com.day11;

interface Test{
	public int total();
	public void write(); // method 정의 

}

class TestImple implements Test{

	private String hak, name;
	private int kor, eng;

	// 기본 생성자
	public TestImple() {
	}

	//생성자 오버로딩 
	public TestImple(String hak, String name, int kor, int eng){ // 우회도로(private) 
		this.hak=hak;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}

	public void set(String hak, String name, int kor, int eng) { // 우회도로(private) 
		this.hak=hak;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}

	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		System.out.println(hak+","+name+","+total()); //메소드 호출 가능. 
	}

	@Override
	public boolean equals(Object ob) { //object의 equals를 오버라이드 (실제 데이터 비교) 
		//ob1.equals(ob2(TestImple)) ob 안에는 ob2(TestImple)가 들어가게됨. (upcast 됨.)
		//object는 가장 큰 .. 부모?이니까 거의 upcast가 되어있다고 생각하면 된다. 
		boolean flag = false;

		if(ob instanceof TestImple) {// 원래 데이터 타입 ( upcast 됐으니까) 
			
			TestImple t = (TestImple)ob;  // downcast !!
			//t= ob2(TestImple) 
			
			if(this.hak.contentEquals(t.hak) && t.name.equals(this.name)) {
				//this= ob1(String의 equals ->실제 데이터비교) t= ob2 
				// t.name= ob2 , equals -> String의 equals -> 실제 데이터 비교. this= ob1. 
				// 결론, 같은 값이 들어있기 때문에 동일인물으로 나온다. 
				flag = true;
			}	
		}
		return flag;
	}
}

public class Test3 {

	public static void main(String[] args) {
		TestImple ob1 = new TestImple("1111","배수지",80,90); // 오버로딩된거 쓴거다.
		TestImple ob2 = new TestImple("1111","배수지",100,100);

		if(ob1.equals(ob2)) { //equals는 주소를 비교. ( 위 오버라이드 때문에 자식꺼쓴다.)
			System.out.println("ob1 과 ob2 동일인물이다.");
		} else {
			System.out.println("ob1 괴 ob2 동일인물이 아니다.");
		}
		// if문의 equals는 주소를 비교하기 때문에 동일인물이 아니라고 출력된다. 

		ob1.write();
		ob2.write();

	}
}

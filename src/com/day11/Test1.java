package com.day11;

class SuperTest{
	public int a=10,b=20;
	
	public void write() {
		System.out.println("슈퍼 클래스 write() 메소드 ..");
	}
	
	public int hap() {
		return a+b;
		
	}	
}

class SubTest extends SuperTest{
	public int b=100,c=200;
	public void print() {
		System.out.println("서브 클래스 print() 메소드 ..");
	}
		@Override
		public int hap() {
						return a+b+c;
		}
}

public class Test1 {

	public static void main(String[] args) {
		
		SubTest ob1=new SubTest();
		System.out.println("ob1.b :" +ob1.b);//100
		
		SuperTest ob2 = ob1;
		//SuperTest ob2= (SuperTest)ob1; 위랑 같음. 자식 -> 부모로 형변환 
		
		System.out.println("ob2.b :"+ob2.b); //20 ob2가 부모 ? ob1 은 자식?
		
		System.out.println("합:"+ob2.hap());  // 자식 a+b+c;
		
		ob2.write();
		//ob2.print(); : 자식꺼는 자식꺼라 부모가 사용할 수 없어서 error 
		
		((SubTest)ob2).print(); // downcast. 부모->자식 으로 형변환 위에 에러가 실행됨. 
	
	}

}

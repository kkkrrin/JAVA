package com.day15;
//스레드 동기화 

class Mythread4 implements Runnable{

	private int bank= 10000;

	private int getBank() { // getter 
		return bank; // 잔액 
	}

	private int drawMoney(int m) {
		bank -= m; //bank=bank-m;
		return m; // 얼마 인출했는지 돌려준다. 
	}

	@Override
	public void run() {
		int moneyNeed = 6000;  // 필요한 돈 ( 인출 )
		int money; //잔액 

		String msg = ""; // 메세지 출력할 변수 . 

		try {
			
			synchronized (this) { // this 는 자기자신.  t1 이 실행되고 나가야지 t2 가 점유 가능. 

				if(getBank() >= moneyNeed) {
					money = drawMoney(moneyNeed);
					msg="인출 성공 ! ";			
				} else {
					money=0;
					msg="인출 실패 ! ";

				}

				System.out.println(Thread.currentThread().getName() + ": " + msg +", 인출 금액 :"+money 
						+ ", 잔고(남은금액) : "+ getBank());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Thread4 {

	public static void main(String[] args) {

		Mythread4 ob = new Mythread4(); //객체 생성. 

		Thread t1= new Thread(ob); // runnable target();  upcast ????? 흠. 
		Thread t2= new Thread(ob);
		//	 ==Thread t2= new Thread(new Mythread4());

		t1.start();
		t2.start();
	}

}

package project02;

class DThread extends Thread{

	int cnt =0;
	String str;
	
	public void run() {
		
		while(true) {
			System.out.print(".");
			
			try {
				sleep(300);
				
				if(cnt==10)
					break;
				cnt++;
				
			} catch (Exception e) {
				
				System.out.println(e.toString());
				
				}
		}
		
		System.out.println("로그인 되었습니다.");
		
	}
	
	
}

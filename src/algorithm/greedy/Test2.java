package algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// ATM
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int time[]=new int[n]; // 걸리는 시간 입력 받음. 
		
		for(int i=0;i<n;i++) {
			time[i]=sc.nextInt();
		}
		
		//시간 누적을 최소화하기위해 오름차순으로 정렬한다. 
		Arrays.sort(time);
		
		
		int prev =0; // 이전까지 대기시간 누적 합
		int sum= 0; // 사람 별 대기시간 총 합
		
		for(int i=0;i<n; i++) {
			//이전까지 대기시간 + 현재사람이 걸리는 시간 
			sum+=prev+time[i];
			
			//이전까지 누적합 + 현재 걸리는시간. 
			prev+=time[i];
		}
	
		System.out.println(sum);
		sc.close();
	}

}

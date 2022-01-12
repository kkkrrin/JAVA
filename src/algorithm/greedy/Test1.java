package algorithm.greedy;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//backjoon  동전 0 

		Scanner sc= new Scanner(System.in);
		
		int  n,k;

		n=sc.nextInt();
		k=sc.nextInt();
		
		int coin_types[]=new int[n];
		
		for(int i=0; i<coin_types.length;i++) {
			coin_types[i]=sc.nextInt();
		}
		
		int count=0;	
		int temp;
		
		for(int i=n-1; i>=0; i--) {
			if(coin_types[i]<=k) {
				temp=k/coin_types[i]; // 몫 
				count+=temp; 
				k-=temp*coin_types[i];
			}
	
		}

		System.out.println(count);
			
		sc.close();
		
		
	}

}

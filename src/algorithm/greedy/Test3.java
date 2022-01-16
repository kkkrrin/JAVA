package algorithm.greedy;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		//greedy 주유소 알고리즘
		
		Scanner sc = new Scanner(System.in);
		
		int city_num=sc.nextInt();
		
		int path[]=new int[city_num-1];
		
		for(int i=0;i<city_num-1;i++) {
			path[i]=sc.nextInt();		
		}
		
		int price[]=new int[city_num];
		
		for(int i=0;i<city_num;i++) {
			price[i]=sc.nextInt();
		}
		
		int result=0;
		int liter=price[0];
		
		for(int i=0; i<city_num-1;i++) {
			if(price[i]<liter) {
				liter=price[i];
			}
			result+=(liter*path[i]);
			
		}
			
		System.out.println(result);
			
	}

}

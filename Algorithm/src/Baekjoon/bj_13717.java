package Baekjoon;

import java.util.Scanner;

public class bj_13717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	
		String arr[][]=new String[T][2];
		
		int sum = 0,max = 0;
		for(int i = 0;i < T;i++) {
			int cnt = 0;
			arr[i][0]=sc.next();
			int K = sc.nextInt(),M = sc.nextInt();
			
			while(K<=M) {
				M-=K;
				M+=2;
				cnt++;
			}
			sum+=cnt;
			arr[i][1]=Integer.toString(cnt);
			max = Math.max(cnt, max);
		}
		
		for(int i = 0;i < T;i++) {
			if(Integer.parseInt(arr[i][1])==max) {
				System.out.println(sum+"\n"+arr[i][0]);
				break;
			}
		}
		
	}

}

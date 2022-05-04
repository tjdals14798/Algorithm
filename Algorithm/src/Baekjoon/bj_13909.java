package Baekjoon;

import java.util.Scanner;

public class bj_13909 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T+1];
		
		
		for(int i = 1;i < T;i++) {
			int cnt = 0;
			while(true) {
				cnt+=1;
				int res = i*cnt;
				if(res>=T) break;
				
				if(arr[res]==0) arr[res]=1;
				else arr[res]=0;
			}
		}
		
		int cnt = 0;
		for (int i : arr) {
			if(arr[i]==1) cnt++;
		}
		System.out.print(cnt);

	}

}

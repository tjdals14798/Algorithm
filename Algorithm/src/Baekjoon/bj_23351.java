package Baekjoon;

import java.util.Scanner;

public class bj_23351 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		int arr[]=new int[N];
		
		for(int i = 0;i < N;i++) {
			arr[i] = K;
		}
		boolean ck = false;
		int idx=0;
		int day=0;
		
		while(true) {
			
			for(int i = 0;i < A;i++) {
				arr[idx]+=B;
				idx++;
				if(idx>=N)idx=0;
			}
			
			for(int i = idx;i < N;i++) {
				arr[i]-=1;
			}
			day++;
			for(int i = 0;i < N;i++) {
				if(arr[i]==0) ck=true;
			}
			if(ck) break;
		}
		System.out.println(day);
		
	}

}

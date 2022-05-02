package Baekjoon;

import java.util.Scanner;

public class bj_20155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),M = sc.nextInt();
		int arr[] = new int[M+1];
		
		for(int i = 0;i < N;i++) {
			int idx = sc.nextInt();
			arr[idx]++;
		}
		
		int cnt = 0;
		
		for(int i = 1;i < arr.length;i++) {
			cnt = Math.max(arr[i], cnt);
		}
		
		System.out.println(cnt);

	}

}

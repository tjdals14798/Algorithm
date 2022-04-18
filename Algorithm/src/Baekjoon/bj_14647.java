package Baekjoon;

import java.util.Scanner;

public class bj_14647 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		String arr[][]=new String[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]=sc.next();
			}
		}
		
		int sum = 0,max=0;
		
		for(int i=0;i<N;i++) {
			int cnt = 0;
			for(int j=0;j<M;j++) {
				for(int k=0;k<arr[i][j].length();k++) {
					if(arr[i][j].charAt(k)=='9') {
						sum++;
						cnt++;
					}
				}
				max=Math.max(cnt, max);
			}
		}
		System.out.println(sum-max+"dho?");

	}

}

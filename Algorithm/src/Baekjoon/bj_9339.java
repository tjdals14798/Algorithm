package Baekjoon;

import java.util.Scanner;

public class bj_9339 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 0;tc < T;tc++) {
			int k = sc.nextInt();
			
			int arr[] = new int[k];
			
			for(int i = 0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
			int n = sc.nextInt();
			int cnt = 0, idx = 0;
			int hour = 24, min = 60;
			
			for(int i = 0;i<n;i++) {
				int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
				for(int j = 0;j<arr.length;j++) {
					if(arr[j]==a) {
						if(b==-1) break;
						if(b<=6&&c==0 || b<=5&&c<60) {
							cnt++;
							if(hour > b || hour>=b && min > c) {
								hour = Math.min(b, hour);
								min = Math.min(c, min);
								idx = j;
							}
						}
					}
				}
				
			}
			System.out.println(arr[idx]+" "+cnt);
		}

	}

}

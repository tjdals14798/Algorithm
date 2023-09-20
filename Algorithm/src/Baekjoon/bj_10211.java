package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10211 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < n; t++) {
			int num = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int arr[] = new int[num + 1];
			int dp[] = new int[num + 1]; 
			int max = Integer.MIN_VALUE;
			
			for(int i = 1; i <= num; i ++) {
				arr[i] = Integer.parseInt(st.nextToken());
				dp[i] = dp[i - 1] + arr[i];
				max = Math.max(max, Math.max(arr[i], dp[i]));
			}
			for(int i = 1; i <= num; i++) {
				for(int j = num; j > i; j--) {
					max = Math.max(max, dp[j] - dp[i]);
				}
			}
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}

}

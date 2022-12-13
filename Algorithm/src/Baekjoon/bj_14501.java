package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14501 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int d[] = new int[N], m[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			d[i] = Integer.parseInt(st.nextToken());
			m[i] = Integer.parseInt(st.nextToken());
		}
		int[] dp = new int[N+1];
		
		for (int i=0; i<N; i++) {
			if (i + d[i] <= N) {
				//날짜가 범위를 넘어가지 않는 경우
				dp[i + d[i]] = Math.max(dp[i + d[i]], dp[i] + m[i]);
			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		System.out.println(dp[N]);
	}

}

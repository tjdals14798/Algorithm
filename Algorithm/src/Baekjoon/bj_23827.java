package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_23827 {
	private static final long MOD = 1000000007;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long arr[] = new long[n+1];
		
		for(int i = 1; i <= n; i++) arr[i] = Long.parseLong(st.nextToken());
		long sumarr[] = new long[n+2];
		for(int i = n; i >= 1; i--) sumarr[i] += sumarr[i+1] + arr[i];
		long sum = 0L;
		for(int i = 1; i <= n; i++) {
			sum +=arr[i] * sumarr[i+1];
			sum %= MOD;
		}
		System.out.println(sum);
	}
}

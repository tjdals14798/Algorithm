package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_17390 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		int arr[] = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		for(int i = 1; i <= n; i++) arr[i] += arr[i-1];
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			sb.append(arr[r]-arr[l-1]).append("\n");
		}
		System.out.println(sb);
		
		//			시간초과
//		for(int i = 0; i < q; i++) {
//			st = new StringTokenizer(br.readLine());
//			int j = Integer.parseInt(st.nextToken())-1, k = Integer.parseInt(st.nextToken());
//			int sum = 0;
//			for(; j < k; j++) sum += arr[j];
//			sb.append(sum).append("\n");
//		}
//		System.out.println(sb);
	}
}

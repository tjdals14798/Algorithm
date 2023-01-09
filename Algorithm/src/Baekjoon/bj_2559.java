package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2559 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		
		int max = 0;
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());		
		
		for(int i = 0; i <= n-k; i++) {
			int sum = 0;
			for(int j = i; j < i+k; j++) {
				sum += arr[j];
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

}

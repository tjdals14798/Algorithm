package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2960 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		make_prime(n,k);
		
	}

	public static void make_prime(int n, int k) {
		int arr[] = new int[n+1];
		for(int i = 2; i <= n; i++) arr[i] = i;
		for(int i = 2; i <= n; i++) {
			if(arr[i] == 0) continue;
			
			for(int j = i; j <= n; j+=i) {
				if(arr[j] != 0) {
					arr[j] = 0;
					k--;
					if(k == 0) {
						System.out.println(j);
						return;
					}
				}
			}
		}
		
	}
}

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9613 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int cnt = 0; cnt < t; cnt++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			long sum = 0;
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					sum += gcd(arr[i],arr[j]);
				}
			}
			System.out.println(sum);
		}
		
	}
	
	static int gcd(int a,int b) {
		if(b == 0) return a;
		else return gcd(b, a % b);
	}

}

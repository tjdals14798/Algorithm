package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11047 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), cnt = 0;
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		
		while(k!=0) {
			for(int i = n-1; i >= 0; i--) {
				if(k>=arr[i] && k-arr[i]>=0) {
					k -= arr[i];
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
		
	}
}

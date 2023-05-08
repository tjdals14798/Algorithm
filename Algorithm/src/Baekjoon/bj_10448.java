package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10448 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[45];
		for(int i = 1; i < arr.length; i++) arr[i] = i * (i+1) / 2;
		
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			int res = Eureka(n, arr);
			sb.append(res).append("\n");
		}
		System.out.println(sb);
		
	}
	
	public static int Eureka(int a, int Err[]) {
		for(int j = 1; j < 45; j++) {
			for(int k = 1; k < 45; k++) {
				for(int l = 1; l < 45; l++) {
					int sum = Err[j]+Err[k]+Err[l];
					if(sum == a) return 1;
				}
			}
		}
		return 0;
	}
	
	

}

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_9461 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long arr[] = new long[100];
		arr[0] = 1; arr[1] = 1; arr[2] = 1;
		
		for(int cnt = 0; cnt < t; cnt++) {
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 3; i < n; i++) arr[i] = arr[i - 2] + arr[i - 3];
			
			System.out.println(arr[n-1]);
		}
	}

}

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_13301 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long arr[] = new long[N+1];
		
		arr[0] = 2;
		arr[1] = 4;
		
		for(int i = 2; i <= N; i++) arr[i] = arr[i-1] + arr[i-2];
		System.out.println(arr[N]);
		
	}

}

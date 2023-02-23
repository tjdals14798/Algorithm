package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2749 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine()); 
		int mod = 1000000, pisano = mod / 10 * 15;
		
		long arr[] = new long[pisano];
		arr[0] = 0; arr[1] = 1;
		
		for(int i = 2; i < pisano; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			arr[i] = arr[i] % mod;
		}
		int idx = (int)(n % pisano);
		System.out.println(arr[idx]);

	}

}

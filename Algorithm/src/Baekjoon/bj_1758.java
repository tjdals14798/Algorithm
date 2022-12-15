package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class bj_1758 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long max = 0;
		Integer arr[] = new Integer[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr, Collections.reverseOrder());

		for(int i = 1; i <= N; i++) {
			int m = arr[i-1]-(i-1);
			if(m>0) max += m;
		}
		System.out.println(max);
	}

}

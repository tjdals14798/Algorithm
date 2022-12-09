package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class bj_2217 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0, min = Integer.MAX_VALUE;
		Integer arr[] = new Integer[N];
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			if(min > arr[i]) min = arr[i];
			int w = min * (i+1);
			if(max < w) max = w;
		}
		System.out.println(max);
	}

}

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2491 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int ucnt = 1, max = 1, dcnt = 0;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] <= arr[i+1]) ucnt++;
			else ucnt = 1;
			max = Math.max(max, ucnt);
		}
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i] >= arr[i+1]) dcnt++;
			else dcnt = 1;
			max = Math.max(max, dcnt);
		}
		System.out.println(max);
		
	}

}

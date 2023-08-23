package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1449 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i ++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		double left = arr[0] - 0.5;
		
		int cnt = 1;
		for(int i = 0; i < N; i++) {
			if(left + L < arr[i]) {
				cnt++;
				left = arr[i] - 0.5;
			}
		}
		System.out.println(cnt);
	}

}

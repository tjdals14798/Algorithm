package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1940 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine()), cnt = 0;
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(arr[i]+arr[j]==M) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}

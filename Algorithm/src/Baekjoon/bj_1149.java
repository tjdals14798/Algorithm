package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1149 {
	static int R = 0;
	static int G = 1;
	static int B = 2;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][R] = Integer.parseInt(st.nextToken());
			arr[i][G] = Integer.parseInt(st.nextToken());
			arr[i][B] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i < n; i++) {
			arr[i][R] += Math.min(arr[i - 1][G], arr[i - 1][B]);
			arr[i][G] += Math.min(arr[i - 1][R], arr[i - 1][B]);
			arr[i][B] += Math.min(arr[i - 1][G], arr[i - 1][R]);
		}
		System.out.println(Math.min(Math.min(arr[n - 1][R], arr[n - 1][G]), arr[n - 1][B]));
	}

}

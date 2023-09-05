package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_15650 {

	static int arr[];
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		N_M(1, 0);
		System.out.println(sb);
	}
	public static void N_M(int start, int dep) {
		if(dep == m) {
			for(int val : arr) sb.append(val).append(" ");
			sb.append("\n");
			return;
		}
		for(int i = start; i <= n; i++) {
			arr[dep] = i;
			N_M(i + 1, dep + 1);
		}
	}
}

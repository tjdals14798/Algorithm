package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_15649 {

	static boolean ck[];
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		ck = new boolean[n];
		
		N_M(n, m, 0);
		System.out.println(sb);
	}
	public static void N_M(int n, int m, int cnt) {
		if(cnt == m) {
			for(int val : arr) sb.append(val).append(" ");
			sb.append("\n");
			return;
		}
		for(int i = 0; i < n; i++) {
			if(!ck[i]) {
				ck[i] = true;
				arr[cnt] = i + 1;
				N_M(n, m, cnt + 1);
				ck[i] = false;
			}
		}
	}
}

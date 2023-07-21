package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2422 {
	static int ice[] = new int[3];
	static boolean arr[][];
	static boolean ck[];
	static int N,M,cnt = 0;	

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N+1][N+1];
		ck = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = true;
		}
		dfs(0,1);
		System.out.println(cnt);
	}
	
	public static void dfs(int d, int start) {
		if(d == 3) {
			for(int i = 0; i < 3; i++) {
				for(int j = i+1; j < 3; j++) {
					if(arr[ice[i]][ice[j]]) return;
				}
			}
			cnt++;
			return;
		}
		for(int i = start; i <= N; i++) {
			if(ck[i]==false) {
				ck[i] = true;
				ice[d] = i;
				dfs(d+1,i+1);
				ck[i] = false;
			}
		}
	}

}

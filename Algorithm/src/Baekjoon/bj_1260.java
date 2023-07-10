package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_1260 {
	static StringBuilder sb = new StringBuilder();
	static boolean ck[];
	static int arr[][];
	static Queue<Integer> q = new LinkedList<>();
	
	static int N, M, V;

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		ck = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()),
				b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
			
		}
		
		dfs(V);
		sb.append("\n");
		
		ck = new boolean[N+1];
		bfs(V);
		
		System.out.println(sb);

	}
	
	public static void dfs(int V) {
		ck[V] = true;
		sb.append(V).append(" ");
		for(int i = 0; i <= N; i++) {
			if(arr[V][i] == 1 && !ck[i]) dfs(i);
		}
	}
	
	public static void bfs(int V) {
		q.add(V);
		ck[V] = true;
		
		while(!q.isEmpty()) {
			V = q.poll();
			sb.append(V).append(" ");
			
			for(int i = 1; i <= N; i++) {
				if(arr[V][i] == 1 && !ck[i]) {
					q.add(i);
					ck[i] = true;
				}
			}
		}
	}

}

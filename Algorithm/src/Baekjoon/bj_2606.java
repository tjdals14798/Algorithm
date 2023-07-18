package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_2606 {
	
	static int arr[][];
	static int ck[];

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()),
			m = Integer.parseInt(br.readLine());
		
		arr = new int[n+1][n+1];
		ck = new int[n+1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()),
				b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		bfs(1);
	}
	
	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		
		ck[start] = 1;
		q.offer(start);
		int cnt = 0;	//감염된 컴퓨터
		while(!q.isEmpty()) {
			int f = q.poll();
			
			for(int i = 1; i <arr.length; i++) {	//	차례대로 1번과 연결된 컴퓨터 찾기
				if(arr[f][i] == 1 && ck[i] != 1) {
					q.offer(i);
					ck[i] = 1;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}

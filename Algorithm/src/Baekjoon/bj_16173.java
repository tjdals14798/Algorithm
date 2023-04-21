package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_16173 {
	static int n;
	static int arr[][];
	static int nx[] = {0, 1}, ny[] = {1, 0};
	static boolean[][] visited;

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		visited = new boolean[n][n];
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		dfs(0,0);
		System.out.println("Hing");
		
	}
	public static void dfs(int i, int j) {
		if(arr[i][j] == -1) {
			System.out.println("HaruHaru");
			System.exit(0);
		}
		
		for(int k = 0; k < 2; k++) {
			int x = i + nx[k] * arr[i][j];
			int y = j + ny[k] * arr[i][j];
			if(x >= n || y >= n || visited[x][y]) continue;
			
			visited[x][y] = true;
			dfs(x, y);
		}
	}

}

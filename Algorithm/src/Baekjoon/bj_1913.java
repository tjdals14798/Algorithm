package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1913 {

	static int n, m;
	static int arr[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		create();
		
		StringBuilder sb = new StringBuilder();
		int resR = 0, resC = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(arr[i][j]).append(" ");
				if(arr[i][j] == m) {
					resR = i+1;
					resC = j+1;
				}
			}
			sb.append("\n");
		}
		sb.append(resR).append(" ").append(resC);
		System.out.println(sb);
		
	}
	
	public static void create() {
		int r = n / 2, c = n / 2,
			next = 0, cnt = 0, max = 1, turn = 0;
		
		for(int i = 1; i <= n * n; i++) {
			arr[r][c] = i;
			
			r += dx[next % 4];
			c += dy[next % 4];
			cnt++;
			
			if(cnt == max) {
				next++;
				cnt = 0;
				turn++;
			}
			
			if(turn == 2) {
				max++;
				turn = 0;
			}
		}
	}

}

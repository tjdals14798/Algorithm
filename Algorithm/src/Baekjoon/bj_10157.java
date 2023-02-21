package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10157 {
	

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(br.readLine());
		
		if(c*r < k) {
			System.out.println(0);
			return;
		}
		
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		boolean arr[][] = new boolean[r][c];
		
		int x = r-1, y = 0, idx = 0, cnt = 0;
		while(++cnt != k) {
			arr[x][y] = true;
			
			int nx = x + dx[idx];
			int ny = y + dy[idx];
			
			if(nx < 0 || ny < 0 || nx >= r || ny >= c || arr[nx][ny]) {
				idx = ++idx % 4;
				nx = x + dx[idx];
				ny = y + dy[idx];
			}
			
			x = nx;
			y = ny;
		}
		
		System.out.println((y+1) +" "+ (r-x));
	}

}

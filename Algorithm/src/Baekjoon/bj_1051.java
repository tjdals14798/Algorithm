package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1051 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int arr[][] = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		int box = Math.min(n, m);
		
		while(box > 1) {
			for(int i = 0; i <= n - box; i++) {
				for(int j = 0; j <= m - box; j++) {
					int start = arr[i][j];
					
					if(start == arr[i][j+box-1] && start == arr[i+box-1][j] && start == arr[i+box-1][j+box-1]) {
						System.out.print(box*box);
						return;
					}
				}
			}
			box--;
		}
		System.out.println(box*box);
	}

}

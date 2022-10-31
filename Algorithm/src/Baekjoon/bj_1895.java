package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1895 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
		int arr[][] = new int[R][C];
		int dp[] = new int[9];
		
		for(int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < C; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int T = Integer.parseInt(br.readLine()), cnt = 0, idx = 0;
		int[] res = new int[(R-2)*(C-2)];
		
		for(int i = 0; i < R-2; i++) {
			cnt = 0;
			for(int j = 0; j < C-2; j++) {
				dp[cnt] = arr[i][j];
				dp[cnt+1] = arr[i][j+1];
				dp[cnt+2] = arr[i][j+2];
				dp[cnt+3] = arr[i+1][j];
				dp[cnt+4] = arr[i+1][j+1];
				dp[cnt+5] = arr[i+1][j+2];
				dp[cnt+6] = arr[i+2][j];
				dp[cnt+7] = arr[i+2][j+1];
				dp[cnt+8] = arr[i+2][j+2];
				Arrays.sort(dp);
				res[idx] = dp[4];
				idx++;
			}
		}
		
		int c = 0;
		for(int i = 0; i < res.length; i++) if(res[i]>T) c++;
		
		System.out.println(c);
		
	}

}

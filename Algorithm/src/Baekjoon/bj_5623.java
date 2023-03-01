package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_5623 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[][] = new int[n+1][n+1];
		int res[] = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		if(n == 2) System.out.println("1 1");
		else {
			res[1] = ((arr[1][2] + arr[2][3] + arr[1][3]) / 2) - arr[2][3];
			sb.append(res[1]+" ");
			for(int i = 2; i <= n; i++) {
				res[i] = arr[i - 1][i] - res[i - 1];
				sb.append(res[i]+" ");
			}
		}
		System.out.println(sb.toString());
	}

}

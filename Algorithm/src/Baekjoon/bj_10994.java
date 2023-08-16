package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10994 {

	static char arr[][];
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		n = 4 * n - 3;
		arr = new char[n][n];
		
		 for (int i = 0; i < n; i++) {
			 for (int j = 0; j < n; j++) {
				 arr[i][j] = ' ';
			 }
		}
		 
		star(0,n);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static void star(int a, int len) {
		if(len <= a) return;
		
		for(int i = a; i < len; i++) {
			arr[a][i] = '*';
			arr[len - 1][i] = '*';
			arr[i][a] = '*';
			arr[i][len - 1] = '*';
		}
		star(a + 2,len - 2);
	}

}

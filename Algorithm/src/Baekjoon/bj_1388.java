package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1388 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),cnt = 0;
		char arr[][] = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				arr[i] = str.toCharArray();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j]=='-') {
					if(j == M-1 || arr[i][j+1]=='|') cnt++;
				}
				
				if(arr[i][j]=='|') {
					if(i == N-1 || arr[i+1][j]=='-') cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}

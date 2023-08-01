package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2312 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			
			for(int j = 2; j <= M; j++) {
				int cnt = 0;
				while(M % j == 0) {
					cnt++;
					M /= j;
				}
				if(cnt != 0) sb.append(j).append(" ").append(cnt).append("\n");
				if(M == 0) break;
			}
		}
		System.out.println(sb);
	}

}
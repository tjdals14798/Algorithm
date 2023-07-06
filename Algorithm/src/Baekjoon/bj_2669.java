package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2669 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean arr[][] = new boolean[101][101];
		
		for(int i = 0; i < 4; i++) {
			int idx[] = new int[4];
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 4; j++) idx[j] = Integer.parseInt(st.nextToken());
			
			for(int j = idx[1]; j < idx[3]; j++) {
				for(int k = idx[0]; k < idx[2]; k++) {
					arr[j][k] = true;
				}
			}
		}
		int cnt = 0;
		for(int j = 1; j <= 100; j++) {
			for(int k = 1; k <= 100; k++) {
				if(arr[j][k]) cnt++;
			}
		}
		System.out.println(cnt);
	}

}

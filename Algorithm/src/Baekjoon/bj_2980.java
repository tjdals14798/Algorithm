package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2980 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()), time = 0, next = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken()), G = Integer.parseInt(st.nextToken());
			
			time += idx - next;
			next = idx;
			
			int RorG = time % (R + G);
			if(RorG < R) time += R - RorG;
		}
		System.out.println(time + L - next);
	}

}

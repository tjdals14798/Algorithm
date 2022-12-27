package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class bj_2276 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb;
		for(int cnt = 0; cnt < T; cnt++) {
			Set<Integer> set = new HashSet<>();
			sb = new StringBuilder();
			
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < N; i++)
				set.add(Integer.parseInt(st.nextToken()));
			
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < M; i++) 
				sb.append(set.contains(Integer.parseInt(st.nextToken()))? 1:0).append("\n");
			
			System.out.print(sb);
		}
	}

}

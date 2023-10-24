package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_17262 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int startP = -1, endP = 1000001;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			if(start > startP) startP = start;
			if(end < endP) endP = end;
		}
		
		int res = startP - endP;
		
		if(res < 0) sb.append(0);
		else sb.append(res);
		
		sb.append("\n");
		
		System.out.println(sb);
		
	}

}

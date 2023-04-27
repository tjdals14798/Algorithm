package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_4796 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int cnt = 1;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken()),
				P = Integer.parseInt(st.nextToken()),
				V = Integer.parseInt(st.nextToken());
			if(L+P+V == 0) break;
			int day = L * (V / P) + Math.min(L, V % P);
			sb.append("Case ").append(cnt).append(": ").append(day).append("\n");
			cnt++;
		}
		System.out.println(sb);
	}

}

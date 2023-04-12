package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9093 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
			
		for(int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				bf = new StringBuffer(st.nextToken());
				sb.append(bf.reverse()).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}

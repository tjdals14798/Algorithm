package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_25214 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int ans = 0;
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(min > num) min = num;
			else ans = Math.max(ans, num - min);
			
			sb.append(ans).append(" ");
		}
		System.out.println(sb);
	}

}

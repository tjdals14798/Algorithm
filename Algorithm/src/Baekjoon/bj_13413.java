package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_13413 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			int len = Integer.parseInt(br.readLine());
			int wcnt = 0, bcnt = 0;
			String start = br.readLine(), end = br.readLine();
			
			for(int j = 0; j < len; j++) {
				if(start.charAt(j) != end.charAt(j)) {
					if(start.charAt(j) == 'W') bcnt++;
					else wcnt++;
				}
			}
			
			if(bcnt >= wcnt) sb.append(bcnt);
			else sb.append(wcnt);
			
			sb.append("\n");
		}
		System.out.println(sb);
		
	}

}

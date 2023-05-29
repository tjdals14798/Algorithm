package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11815 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			Long num = Long.parseLong(st.nextToken());
			boolean ck = false;
			
			long sqrt = (long)Math.sqrt(num);
			
			while(num < sqrt * sqrt) sqrt -= 1;
			if(num == sqrt * sqrt) ck = true;
			
			if(ck) sb.append(1).append(" ");
			else sb.append(0).append(" ");
			
		}
		System.out.println(sb);
		
//		while(st.hasMoreTokens()) {
//			Long num = Long.parseLong(st.nextToken());
//			int cnt = 0;
//			
//			for(int i = 1; i <= num; i++) {
//				if(num % i == 0) cnt++;
//			}
//			
//			if(cnt % 2 == 0) sb.append("0 ");
//			else sb.append("1 ");
//		}
//		System.out.println(sb);
	}

}

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_19939 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= k; i++) {
			n-=i;
			if(n < 0) break;
		}
		
		if(n >= 0) {
			if(n % k > 0) sb.append(k);
			else sb.append(k-1);
		}else sb.append(-1);
		
		System.out.println(sb);
		
	}

}
